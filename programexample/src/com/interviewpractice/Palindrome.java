package com.interviewpractice;

public class Palindrome {
	public static void main(String[] args) {

	int given=12321;
	int reverse=0;
	int temp=given;
	
	while (given>0){
		
		reverse=reverse*10;
		reverse=reverse+given%10;
		given=given/10;
	}
	System.out.println(reverse);
		if(reverse==temp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
