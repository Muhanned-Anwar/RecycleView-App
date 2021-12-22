package com.example.recycleviewquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleviewquiz.dapters.ProductAdapter;
import com.example.recycleviewquiz.models.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("HP core i5, 6M RAM",859.5,R.drawable.laptop1,false));
        products.add(new Product("DEL core i5, 8M RAM",950.4,R.drawable.laptop2,false));
        products.add(new Product("MSI core i9, 16M RAM",1400.3,R.drawable.laptop3,false));
        products.add(new Product("DEL core i9, 32M RAM",1600.5,R.drawable.laptop4,true));
        products.add(new Product("MACBOOK PRO core i5, 6M RAM",1200,R.drawable.laptop5,false));
        products.add(new Product("MAC core i7, 6M RAM",1450,R.drawable.laptop6,false));
        products.add(new Product("MAC core i9, 32M RAM",2400,R.drawable.laptop7,true));
        products.add(new Product("TOSHIBA core i5, 8M RAM",900.3,R.drawable.laptop8,false));
        products.add(new Product("MSI core i7, 32M RAM",1600,R.drawable.laptop9,false));
        products.add(new Product("MAC core i5, 16M RAM",1800,R.drawable.laptop10,false));

        RecyclerView recyclerView = findViewById(R.id.rv);
        ProductAdapter adapter = new ProductAdapter(products);
        recyclerView.setAdapter(adapter);
        recyclerView.hasFixedSize();

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);
    }
}