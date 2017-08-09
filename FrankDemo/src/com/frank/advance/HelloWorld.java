package com.frank.advance;

public class HelloWorld {
	public  static void main(String[] args){
		String s =  "Hello World!";
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.substring(0,4));
		System.out.println(s.indexOf("Hello"));
		System.out.println(s.startsWith(" "));
		System.out.println(s.endsWith("oo"));
		System.out.println(s.equals("Good World!"));
		System.out.println(s.compareTo("Hello Nerd!"));
		System.out.println(s.trim());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace("World", "Universe"));
	}

}
