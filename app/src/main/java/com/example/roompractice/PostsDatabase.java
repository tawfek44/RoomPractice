package com.example.roompractice;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = Post.class,version = 1)
public abstract class PostsDatabase extends RoomDatabase {
    private static PostsDatabase instance;
    public abstract PostInterface postDao();

    public static synchronized PostsDatabase getInstance(Context context)
    {
        if(instance==null)
        {
            instance= Room.databaseBuilder(context.getApplicationContext(),PostsDatabase.class,"posts_table")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

}
