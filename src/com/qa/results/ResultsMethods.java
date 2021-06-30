package com.qa.results;

public class ResultsMethods {
	
	
	public static int marksOverall(int p, int b, int c) {
		System.out.println("\nYour physics score is " + p);
		System.out.println("Your biology score is " + b);
		System.out.println("Your chemistry score is " + c);
		int total = p + b + c;
		System.out.println("\nYour total score is " + total + "/450");
		return total;
	}
	
	public static double markPercentage(int p, int b, int c) {
		System.out.println("\nYour physics score is " + p);
		System.out.println("Your biology score is " + b);
		System.out.println("Your chemistry score is " + c);
		double total = ((p + b + c)*100)/450;
		System.out.println("\nYour average percentage is " + total + "%");
		return total;
	}
}
