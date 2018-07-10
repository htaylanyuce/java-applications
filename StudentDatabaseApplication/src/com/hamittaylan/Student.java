package com.hamittaylan;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int grade;
    private String studentID;
    private int balance = 0;
    private List<String> courses;
    private final int costOfCourse = 600;
    private static int id = 1001;

    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        this.setID(this.grade);
        courses = new ArrayList<String>();
    }

    private void setID(int year)
    {
        this.studentID = year + id + "";
    }

    public void addCourse(String courseID)
    {
        courses.add(courseID);
        this.balance -= this.costOfCourse;

    }

    @Override
    public String toString() {
        String allCourses ="";
        for(String s:this.courses)
        {
            allCourses=s+" ";
        }
        return this.name+" "+this.studentID+" "+ allCourses;
    }
}
