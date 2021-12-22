package com.example.recycleviewquiz.holders;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewquiz.R;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    public View view;
    public ImageView image;
    public TextView nameTxt;
    public TextView priceTxt;
    public Button favBtn;


    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
        image = itemView.findViewById(R.id.product_image);
        nameTxt = itemView.findViewById(R.id.product_name);
        priceTxt = itemView.findViewById(R.id.price);
        favBtn = itemView.findViewById(R.id.btnFav);
    }


}
