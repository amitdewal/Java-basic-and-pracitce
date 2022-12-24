package com.loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       
	       System.out.println("enter ihe number::");
	       int num = sc.nextInt();
	       int orignalNum=num;
	       int sum =0;
	       
	     while (num>0) {
	    	 
	    	sum=num%10+sum;
	    	num/=10;
			
		}
	       System.out.println("the sum of digits in the number  "+orignalNum+" is "+sum);
	}

}
