package com.variableaAndDate;

import java.util.Scanner;

public class Qus5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1 ::");
		int num1 = sc.nextInt();
		System.out.println("enter the num1 ::");
		int num2 = sc.nextInt();
		
		    System.out.println("number before swap ::"+num1+" "+num2);
		int temp;
		    temp = num1;
		    num1=num2;
		    num2= temp;
		    
		    System.out.println("number after swap ::"+num1+" "+num2);
		

	}

}
