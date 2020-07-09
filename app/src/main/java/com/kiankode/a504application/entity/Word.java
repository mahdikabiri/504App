package com.kiankode.a504application.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Word {
    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersian() {
        return persian;
    }

    public void setPersian(String persian) {
        this.persian = persian;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String persian;
    private String english;
    private String description;
}
