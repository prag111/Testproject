package com.pragati;

import java.util.Scanner;

public class Consoleip {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		if(sc.hasNextInt())
		{
		int num= sc.nextInt();
		System.out.println("You enter:"+num);
		}
		else
		{
			System.out.println("You have to enter integer");
		}
		
	}

}
