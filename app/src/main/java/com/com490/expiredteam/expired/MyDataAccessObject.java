package com.com490.expiredteam.expired;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface MyDataAccessObject
{
    //methods for insert, deletion, selection etc...

    @Insert
    public void insertProduct(Product product);

    @Delete
    public void deleteProduct(Product product);

    @Query("select * from Products")
    public List<Product> getAllProducts();
    //read all products from table
}
