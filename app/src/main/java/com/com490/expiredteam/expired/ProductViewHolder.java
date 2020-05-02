package com.com490.expiredteam.expired;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    TextView name, poa;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.productName);
        poa = itemView.findViewById(R.id.productPOA);
    }
}
