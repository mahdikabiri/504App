package com.kiankode.a504application;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.kiankode.a504application.entity.Word;
import com.kiankode.a504application.entity.WordDao;

@Database(entities = {Word.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {

    private static AppDataBase appDataBase;

    public abstract WordDao wordDao();

    public static AppDataBase getInstance(Context context) {
        if (appDataBase == null) {
            appDataBase = Room.databaseBuilder(context, AppDataBase.class, "db504").build();
        }
        return appDataBase;
    }
}
