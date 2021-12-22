package com.example.recycleviewquiz.dapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewquiz.R;
import com.example.recycleviewquiz.holders.ProductViewHolder;
import com.example.recycleviewquiz.models.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {
    private ArrayList<Product> products;
    Context context;

    public ProductAdapter(ArrayList<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item, parent, false);

        return new ProductViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = products.get(position);
        holder.image.setImageResource(product.getImage());
        holder.nameTxt.setText(product.getName());
        holder.priceTxt.setText(product.getPrice() + " $");

//        holder.view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context,product.getName()+"",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(context, Profile.class);
//                intent.putExtra("product",product);
//                context.startActivity(intent);
//            }
//        });

//        holder.favBtn.setBackground(product.isFavourite() ? context.getDrawable(R.drawable.ic_baseline_favorite_24)
//                : context.getDrawable(R.drawable.ic_baseline_favorite_border_24));
        changeStatus(holder,product.isFavourite());


        holder.favBtn.setOnClickListener(view -> {
            product.setFavourite(!product.isFavourite());
//                holder.favBtn.setBackground(product.isFavourite() ? context.getDrawable(R.drawable.ic_baseline_favorite_24)
//                        : context.getDrawable(R.drawable.ic_baseline_favorite_border_24));
            changeStatus(holder, product.isFavourite());
        });


    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void changeStatus(ProductViewHolder holder, boolean status) {
        if (status) {
            holder.favBtn.setBackground(context.getDrawable(R.drawable.ic_baseline_favorite_24));
        } else {
            holder.favBtn.setBackground(context.getDrawable(R.drawable.ic_baseline_favorite_border_24));

        }
    }
}
