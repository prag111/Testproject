package com.pragati;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class KeyboardUtil {
	
	private KeyboardUtil()
	{
		
	}
	public static int getInt(String message)
	{
		
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	public static double getDouble(String message)
	{
		
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		return sc.nextDouble();
	}
	public static String  getString(String message)
	{
		
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		return sc.nextLine();
	}
	public static Date getISODate(String message)
	{
		String pattern="yyyy-MM-dd";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		
		
		System.out.println(message);
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		try
		{
			return (Date) sdf.parse(input);
		}
		catch(Exception e) {
			return null;
		}
		
	}




}
