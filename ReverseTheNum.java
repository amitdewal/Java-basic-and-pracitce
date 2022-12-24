package com.loops;

import java.util.Scanner;

public class ReverseTheNum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       
	       System.out.println("enter ihe number::");
	       int num = sc.nextInt();
	       int orginalNum= num;
	       int reverseNum= 0;
	       while(num>0) {
	    	   
	    	   reverseNum=reverseNum * 10+num % 10;//logical for reverse a number
	    	   num/=10;
	       }
	         System.out.println("the original number is  "+orginalNum+" and reverse number is "+reverseNum);

	}

}
