package com.pragati;

public class Calculator {
	
	public int add(int a,int b)
	{
          a=100;
		int res=a+b;
		return res;
		}
	
	public int add(int a,int b,int c)
	{
		int res=a+b+c;
		return res;
		}
	public static void main(String[] args) {
		Calculator clc=new Calculator();
		int a=10;
		int b=20;
		int c=30;
		System.out.println("Value of a before call by value:"+a);
		int res=clc.add(a,b);
		System.out.println("Value of a after call by value:"+a);
		System.out.println("Addition is" +res);
		
		int secondadd=clc.add(a, b,c);
		System.out.println("sum is" +secondadd);
		
	}

}
