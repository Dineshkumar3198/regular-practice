package com.interviewpractice;

public class Amstrong_nos {
	public static void main(String[] args) {
		int a=153;
		int sum=0;
		int rem;
		int temp=a;
		
	while (a>0) {
		rem=a%10;
		sum=sum+(rem*rem*rem);
		a=a/10;
	}
	
	if(sum==temp) {
		System.out.println("Amstrong ");
		}
	else {
		System.out.println("not a Amstrong");
	}
	}

	
//	public static void main(String[] args) {
//		int a=153;
//		int sum=0;
//		int rem;
//		int temp=a;
//		
//		while(a>0) {
//			rem=a%10;
//			sum=sum+(rem*rem*rem);
//			a=a/10;
//			}
//			//System.out.println(sum);
//			
//			if(sum==temp) {
//				System.out.println("Amstrong");
//			}
//			else {
//				System.out.println("not a amstrong");
//			}
//		}
//	}
}
