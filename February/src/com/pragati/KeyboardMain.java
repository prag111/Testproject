package com.pragati;

import java.sql.Date;

public class KeyboardMain {
	public static void main(String [] args)
	
	
	{
		String name;
		int age;
		double height;
		Date dob;
		name=KeyboardUtil.getString("Enter your name");
		age=KeyboardUtil.getInt("Enter your age");
		height=KeyboardUtil.getDouble("Enter your height");
		dob=KeyboardUtil.getISODate("Enter your dob");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(dob);
	}

}
