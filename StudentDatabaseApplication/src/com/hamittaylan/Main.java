package com.hamittaylan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will be added to the database: ");
        String numberOfStudents = scanner.next();
        //scanner.close();

        List<Student> studentList = new ArrayList<Student>();

        for(int i = 0; i < Integer.parseInt(numberOfStudents);i++)
        {
            scanner = new Scanner(System.in);
            System.out.print("Name of the student: ");
            String name = scanner.next();

            System.out.print("Grade of the student: ");
            String grade = scanner.next();

            studentList.add(new Student(name, Integer.parseInt(grade)));
        }
        scanner.close();

        for(Student s : studentList)
        {
            System.out.println(s.toString());
        }

    }
}
