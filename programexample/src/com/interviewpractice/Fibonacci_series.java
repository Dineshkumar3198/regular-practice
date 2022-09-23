package com.interviewpractice;

import java.util.Scanner;

public class Fibonacci_series {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the value how many times to iterate ");
		
		Scanner scanner = new Scanner(System.in);
		int given=scanner.nextInt();
		
		int a=1;
		int b=2;
		int c;
		
		for(int i=0; i<=given; i++) {
			c=a+b;
			
			System.out.println(c);
			
			a=b;
			b=c;
		}
		
		
		
	}

}
