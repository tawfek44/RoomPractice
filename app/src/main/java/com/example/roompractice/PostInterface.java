package com.example.roompractice;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observer;

import io.reactivex.Completable;
import io.reactivex.Observable;
@Dao
public interface PostInterface {
    @Insert
    Completable insert(Post post);

    @Query( "select * from posts_table")
    Observable<List<Post>> getPosts();
}
