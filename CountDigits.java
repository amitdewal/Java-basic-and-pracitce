package com.loops;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("enter ihe number::");
       int num = sc.nextInt();
       int orginalNum= num;
       int numOfdigits=0;
       
         while (num>0) {
        	 
			num=num/10;
			numOfdigits++;
		}
         
         
	
         System.out.println("the number of digits In the number "+orginalNum+" are "+numOfdigits);
	}

}
