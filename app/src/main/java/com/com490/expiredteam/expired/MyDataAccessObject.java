package com.com490.expiredteam.expired;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface MyDataAccessObject
{
    //methods for insert, deletion, selection etc...

    @Insert
    public void addName(Product name);

}
