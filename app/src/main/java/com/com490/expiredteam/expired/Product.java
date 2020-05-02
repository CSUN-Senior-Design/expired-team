package com.com490.expiredteam.expired;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Products")
public class Product
{

    @PrimaryKey(autoGenerate = true)
     int id;
    //barcode, hold on that
    @ColumnInfo(name = "Name")
    private String name;

    @ColumnInfo(name = "Brand")
    private String brand;

    @ColumnInfo(name = "Period")
    private String poa;
    //private String category;


    public int getId() {
        return id;
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

    public void setPoa(String poa){this.poa = poa; }
    public String getPoa(){
        return poa;
    }



}
