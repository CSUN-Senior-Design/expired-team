package com.com490.expiredteam.expired;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Product.class}, version = 1)
public abstract class MyAppDatabase extends RoomDatabase
{
    public abstract MyDataAccessObject myDao();
}
