package com.loops;
// a raise to b 
import java.util.Scanner;

public class CalcuPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       
	       System.out.println("enter the  a value ::");
	       int a = sc.nextInt();
	       
	       System.out.println("enter the  b value ::");

	       int b = sc.nextInt();
	       int ans= 1;
	       
	       for (int i = 1; i <= b; i++) {
			 ans = ans * a;
		}
	       System.out.println("answers is :: "+ans );
	}

}
