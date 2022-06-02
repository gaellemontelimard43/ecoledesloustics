package com.example.ecoledesloustics.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user")
    List<UserModel> getAll();

    @Query("SELECT * FROM user WHERE prenom= :prenom AND nom = :nom")

    @Insert
    long insert(UserModel user);

    @Insert
    long[] insertAll(UserModel...users);

    @Delete
    void delete(UserModel user);

    @Update (onConflict = OnConflictStrategy.REPLACE)
    void update(Task task);

}
