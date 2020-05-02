package com.com490.expiredteam.expired;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductRecycler extends RecyclerView.Adapter<ProductViewHolder> {
    List<Product> data;

    public ProductRecycler(List<Product> products){
        data = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.product_item_layout,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = data.get(position);
        holder.name.setText(product.getBrand()  );
        holder.poa.setText(product.getPoa());
        // add more of the text boxes
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
