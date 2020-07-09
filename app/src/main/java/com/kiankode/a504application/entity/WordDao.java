package com.kiankode.a504application.entity;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void save(Word word);

    @Update
    void update(Word word);

    @Delete
    void delete(Word note);

    @Query("SELECT * FROM word order by id DESC")
    List<Word> getAll();


}
