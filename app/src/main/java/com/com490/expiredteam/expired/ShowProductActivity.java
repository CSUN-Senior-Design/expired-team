package com.com490.expiredteam.expired;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ShowProductActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    MyDataAccessObject myDataAccessObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_product);

        recyclerView = findViewById((R.id.productRecycleView));

        myDataAccessObject = MyAppDatabase.getDBInstance(this).myDao();

        ProductRecycler productRecycler = new ProductRecycler(myDataAccessObject.getAllProducts());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(productRecycler);
    }
}
