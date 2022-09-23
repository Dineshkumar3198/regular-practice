package com.interviewpractice;

public class Reverse_nos {
	
 
	public static void main(String[] args) {
		
		int given=123456789;
		int reverse = 0;
		
		while (given>0) {
			reverse=reverse*10;
			reverse=reverse + given%10;
			given =given/10;
			
		}
		System.out.println(reverse);
	}

}
