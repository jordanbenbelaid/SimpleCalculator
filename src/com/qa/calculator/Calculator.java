package com.qa.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int a;
		int b;
		int sum;
		char operator;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nEnter first number");
		a = input.nextInt();
		
		System.out.println("\nEnter Second number");
		b = input.nextInt();
		
		System.out.println("\nPlease enter the function you want to use");
		
		operator = input.next().charAt(0);
//		operator = input.next();
//			switch (operator) {
//			case '+':
//				System.out.println("\nThe answer is " + CalcFunctions.add(a, b));
//				break;
//			case '-':
//				System.out.println("\nThe answer is " + CalcFunctions.subtract(a, b));
//				break;
//			case '*':
//				System.out.println("\nThe answer is " + CalcFunctions.multiply(a, b));
//				break;
//			case '/':
//				System.out.println("\nThe answer is " + CalcFunctions.divide(a, b));
//				break;
//				
//			default:
//				System.out.println("ERROR");
//			}
	
		if(operator == '+') {
			System.out.println("\nThe answer is " + CalcFunctions.add(a, b));
		}
		else if(operator == '-') {
			System.out.println("\nThe answer is " + CalcFunctions.subtract(a, b));
		}
		else if(operator == '*') {
			System.out.println("\nThe answer is " + CalcFunctions.multiply(a, b));
		}
		else if(operator == '/') {
			System.out.println("\nThe answer is " + CalcFunctions.divide(a, b));
		}
		else {
			System.out.println("\nINVALID FUNCTION!!!!!!");
		}
		
	}
}
