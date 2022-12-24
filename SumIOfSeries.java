package com.loops;

import java.util.Scanner;
// sum = 1-2+3-4.....n
public class SumIOfSeries {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	       
	       System.out.println("enter ihe number::");
	       int n = sc.nextInt();
	       int ans= 0;
	       
          for (int i = 1; i <= n; i++) {
        	  if(i % 2 ==0) {
        		  System.out.println(i +" is even   ::"  +i);
        		  ans-=i;
        	  }else {
        		  System.out.println(i+" is is odd ::"+i);
        		  ans+=i;
        	  }
			
		}
          
          System.out.println("the sum of series is "+ans);
	}

}
