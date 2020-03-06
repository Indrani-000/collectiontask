package com.epam4.collection;

import java.util.ArrayList;

import com.epam4.collection.student;
public class student {
	
ArrayList<student> student;
	
	
	public student(int n){
		student = new ArrayList<student>(n);
	}

	public void indexOf(student e){
		student.indexOf(e);
	}

	public boolean add(student e)
	{
		 return student.add(e);
	}
	

	public void add(int i, student e) {
		student.add(i, e);
	}

	public student remove(int i){
		return student.remove(i);
	}

	public void remove(student e){
		student.remove(e);
	}

	public void display() {
		for(int i = 0 ; i < student.size() ; i++) {
			student stu = student.get(i);
			System.out.println("\n Student " + (i+1)
							+ ": { Name :" + stu.getName() 
							+ ", Class : " + stu.getStandard()
							+ ", Roll No : " + stu.getRollNo()
							+ ", Age : "+stu.getAge()
							+ ", Address : "+stu.getAddress() + " }"
							);
		}
	}
	
	private String getAge() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getRollNo() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getStandard() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void size() {
		System.out.println("\nThe Student list size is : " + student.size());
	}
}
