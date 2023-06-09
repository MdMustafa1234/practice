package com;

import java.util.Scanner;

public class AddNum {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first digit");
		int x=scan.nextInt();
		
		System.out.println("Enter the second digit");
		int y=scan.nextInt();
		
		int sum=x+y;
		System.out.println("sum  : "+ sum);
		
	}

}
