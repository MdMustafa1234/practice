package com;

public class ReverseString {
	public static void main(String[] args) {
		
		String Orginal="Bangalore is a beautiful city";
		String reverse="";
		
		for(int i=0; i<Orginal.length();i++) {
			reverse=Orginal.charAt(i)+reverse;
		}
		System.out.println(reverse);
	}

}
