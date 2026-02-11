package com.pst;
import java.util.Scanner;
public class Addtwonum {

	public static void main(String[] args) {
		Sum();
	}
	static void Sum() {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A value :");
		 int a = sc.nextInt();
		 System.out.print("Enter B value :");
		 int b = sc.nextInt();
		 int sum = a + b;

	        System.out.println("Sum = " + sum);

	}

}
