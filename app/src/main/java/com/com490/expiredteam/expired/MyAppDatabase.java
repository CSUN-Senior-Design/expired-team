package com.com490.expiredteam.expired;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Product.class}, version = 4, exportSchema = false)
public abstract class MyAppDatabase extends RoomDatabase
{
    private static MyAppDatabase myAppDatabase = null;

    public abstract MyDataAccessObject myDao();

    public static synchronized MyAppDatabase getDBInstance(Context context){
        if(myAppDatabase == null){
            myAppDatabase = Room.databaseBuilder(context.getApplicationContext(),
                    MyAppDatabase.class,"Products19").allowMainThreadQueries().build(); //.fallbackToDestructiveMigration()

        }
        return myAppDatabase;
    }
}
