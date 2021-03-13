package com.pragati;

public class Concat {
public static void main(String[] args)
{
	String s1="Happy";
	String s2="sad";
	String s3="Happy";
	String s4="";
	String s5="PRAGATI";
	String s6="Mumbai";
	String s7="Darwha";
	String s8="Darwha";
	int i=30;
	System.out.println(String.valueOf(i));
	//System.out.println("Original string is:" +s1);
	//System.out.println("After concatenation:" +s1.concat(" learning"));
	//s1=s1.concat("Learning");
	//System.out.println(s1);
	System.out.println(s1.length());
	System.out.println(s1.substring(2));
	System.out.println(s1.compareTo(s3));
	System.out.println(s1.isEmpty());
	System.out.println(s4.isEmpty());
	System.out.println(s1.toUpperCase());
	System.out.println(s5.toLowerCase());
	System.out.println(s6.replace('a','i'));
	System.out.println(s6.contains("m"));
	System.out.println(s7.equals(s8));
	System.out.println(s7.charAt(3));
	System.out.println(s7.endsWith("a"));
	System.out.println(s7.endsWith("n"));
	
	
}
}
