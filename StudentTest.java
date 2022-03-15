package com.te.javabasics.assignmenet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

import com.te.javabasics.collection.Employee;

public class StudentTest {
	public static void main(String[] args) {
		boolean count = true;
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(101, "Rahul",27,98.0, "Delhi"));
		arrayList.add(new Student(102, "Ankita",22,78.0, "Chandigarh"));
		arrayList.add(new Student(103, "Sajana",23,90.4, "Kolkata"));
		arrayList.add(new Student(104, "Bipin",16,76.1, "Assam"));
		arrayList.add(new Student(105, "Shweta",26,98.0, "Shimla"));
		do {
			System.out.println("Enter 1 to sort student details by rollno ");
			System.out.println("Enter 2 to sort student details by name ");
			System.out.println("Enter 3 to sort student details by age");
			System.out.println("Enter 4 to sort student details by marks");
			System.out.println("Enter 5 to sort student details by address");
			
		

	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number = sc.nextInt();
			switch (number) {
			case 1: {
				Collections.sort(arrayList, new CompareByRollNo());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				
			}
			break;
			case 2: {
				Collections.sort(arrayList, new CompareByName());
				for (Student student : arrayList) {
					System.out.println(student);
				}
			
			}
			break;
			case 3: {
				Collections.sort(arrayList, new CompareByAge());
				for (Student student : arrayList) {
					System.out.println(student);
				}
			
			}
			break;
			case 4: {
				Collections.sort(arrayList, new CompareByMarks());
				for (Student student : arrayList) {
					System.out.println(student);
				}
			
			}
			break;
			case 5: {
				Collections.sort(arrayList, new CompareByAddress());
				for (Student student : arrayList) {
					System.out.println(student);
				}
			
			}
			break;
			}
			System.out.println( "Wanted to repeat the details");
			String string = sc.next();
			if (string.equalsIgnoreCase("YES")) {
				count=true;
			}else if (string.equalsIgnoreCase("No")) {
				count=false;
				System.out.println("Exit Program");
			}
			
		}while (count);
	}
}		
		
	
