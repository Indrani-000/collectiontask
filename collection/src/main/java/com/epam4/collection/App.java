package com.epam4.collection;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

import com.epam4.collection.student;
import com.epam4.collection.student;

public class App 
{
	public static void main( String[] args ) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println( "******** Student List *********"
    			+ "\nEnter the total number of students :" );
        int noOfStudents = scanner.nextInt();
        student studentList = new student(noOfStudents);
        
        for(int i = 0 ; i < noOfStudents ; i++) {
        	System.out.print("Enter Student - " + (i+1) + " name : ");
        	String name = scanner.next();
        	System.out.print("Enter Student - " + (i+1) + " Class/Standard :");
        	int standard = scanner.nextInt();
        	System.out.print("Enter Student - " + (i+1) + " Roll No :");
        	String rollNo = scanner.next();
        	System.out.print("Enter Student - " + (i+1) + " age :");
        	int age = scanner.nextInt();
        	System.out.print("Enter Student - "+(i+1)+ " address :");
        	String address= scanner.next();
        	student student = studentnew(name, standard, rollNo, age, address);
        	studentList.add(student);
        }
        System.out.println("\nThe Created Student list is :");
        studentList.size();
        studentList.display();
        
        System.out.println("\n**** The Shrinking Student list is : ****");
        for(int i = noOfStudents - 1 ; i >= 0 ; i--) {
        	studentList.remove(i);
        	System.out.println("\nThe List After Deletion is :");
        	studentList.size();
        	studentList.display();
        }
        System.out.println("\n********* The LIST is Empty *********\n");
        scanner.close();
    }

	private static student studentnew(String name, int standard, String rollNo, int age, String address) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
}
