package com.phoenix.student.main;

import com.phoenix.student.Student;

public class StudentEqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variable
		String s1 = "deep sherathiya";
		String s2 = "deep sherathiya";

		// if else block
		if (s1.equals(s2)) {
			System.out.println("same name");
		} else {
			System.out.println("Diff name");
		}

		// objects of class Student
		Student st1 = new Student(153, "raj", "rajkot", 65.87f);

		Student st2 = new Student(153, "raj", "rajkot", 65.87f);

		// if else block
		if (st1.equals(st2)) {
			System.out.println("same student");
		} else {
			System.out.println("diff student");
		}

		// if else block
		if (st1.equals(s2)) {
			System.out.println("same student");
		} else {
			System.out.println("diff student");
		}

	}

} // end of the class
