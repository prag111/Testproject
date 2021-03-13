package com.pragati;

public class HelloEveryone {
	public void test()
	{
		System.out.println("this is non static method");
	}
	
	public static void testprog()
	{
		System.out.println("This is static method");
	}
	
	
	
	public static void main(String[] args)
	{
		
		HelloEveryone he=new HelloEveryone();
		he.test();
		testprog();
		
		
		System.out.println("Hey there!!");
	}

}
