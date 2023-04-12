package edu.uncc.inclass09;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface GradeDAO {
    @Query("SELECT * from grades")
    List<Grade> getAll();

    @Query("SELECT * FROM grades WHERE courseName = :name limit 1")
    Grade findById(String name);

    @Update
    void update(Grade grade);

    @Insert
    void insertAll(Grade... grades);

    @Delete
    void delete(Grade grade);
}
