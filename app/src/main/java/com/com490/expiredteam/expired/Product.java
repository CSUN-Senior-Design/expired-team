package com.com490.expiredteam.expired;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Product
{

    @PrimaryKey
    private int id;
    //barcode, hold on that

    private String name;

    private String brand;

    //private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
