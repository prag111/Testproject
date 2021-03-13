package com.pragati;

public class DataTypes {
	public static void main(String[] args)
	{
		byte b=10;
		short s=30;
		float f=40f;
		double d=70d;
        int i =20;
		char c='A';
		boolean bln=true;
		String str="Hello";
		String st="23";
		int num =Integer.parseInt(st);
		int n=Integer.valueOf(st);
		String s1=Integer.toString(i);
		String s2=String.valueOf(i);
		System.out.println(b+" " +s+ " "+i+ " "+f+" "+d+" "+c+ " "+bln+" "+str+" "+num+" "+n+" "+s1+" "+s2);
	}

}
