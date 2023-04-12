package edu.uncc.inclass09;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "grades")
public class Grade {

    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo()
    public double courseHours;
    @ColumnInfo()
    public String letterGrade;
    @ColumnInfo()
    public String courseName;
    @ColumnInfo()
    public String courseNumber;

    public Grade(long id, double courseHours, String letterGrade, String courseName, String courseNumber) {
        this.id = id;
        this.courseHours = courseHours;
        this.letterGrade = letterGrade;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public Grade(double courseHours, String letterGrade, String courseName, String courseNumber) {
        this.courseHours = courseHours;
        this.letterGrade = letterGrade;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public Grade() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(double courseHours) {
        this.courseHours = courseHours;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
}
