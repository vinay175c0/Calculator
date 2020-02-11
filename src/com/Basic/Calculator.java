package com.Basic;

import java.util.Scanner;

public class Calculator {
	
	public double add(double num1 , double num2) {
		return num1 + num2;
	}
	
	public double subtraction(double num1 , double num2) {
		return num1 - num2;
	}
	public double product(double num1 , double num2) {
		return num1 * num2;
	}
	public double divide(double num1 , double num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Calculator obj = new Calculator();
		System.out.println("Calculator\n1. Add\n2. Sub\n3. mul\n4. Div\nEnter operation: ");
		int choice = sc.nextInt();
		System.out.println("Enter two inputs");
		double num1 = sc.nextDouble(),num2 = sc.nextDouble(); 
		switch (choice) {
		case 1:
			System.out.println("Sum: "+obj.add(num1, num2));
			break;
		case 2:
			System.out.println("Difference: "+obj.subtraction(num1, num2));
			break;
		case 3:
			System.out.println("Product: "+obj.product(num1, num2));
			break;
		case 4:
			System.out.println("Quotient: "+obj.divide(num1, num2));
			break;
		default:
			System.out.print("Invalid Input\n");
		}
	}

}
