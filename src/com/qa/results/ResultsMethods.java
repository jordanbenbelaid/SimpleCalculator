package com.qa.results;

public class ResultsMethods {
	
	public static int physics = 120;
	public static int chemistry = 138;
	public static int biology = 98;
	public static int total;
	public static double percentage;
	
	
	public static int marksOverall() {
		System.out.println("\nYour physics score is " + physics);
		System.out.println("Your biology score is " + biology);
		System.out.println("Your chemistry score is " + chemistry);
		total = physics + biology + chemistry;
		System.out.println("\nYour total score is " + total + "/450");
		return total;
	}
	
	public static double markPercentage() {
		System.out.println("\nYour physics score is " + physics);
		System.out.println("Your biology score is " + biology);
		System.out.println("Your chemistry score is " + chemistry);
		total = physics + biology + chemistry;
		percentage = ((physics + biology + chemistry)*100)/450.0;
		System.out.println("\nYour average percentage is " + percentage + "%");
		return percentage;
	}
	
//	public static int marksOverall(int p, int b, int c) {
//		System.out.println("\nYour physics score is " + p);
//		System.out.println("Your biology score is " + b);
//		System.out.println("Your chemistry score is " + c);
//		int total = p + b + c;
//		System.out.println("\nYour total score is " + total + "/450");
//		return total;
//	}
//	
//	public static double markPercentage(int p, int b, int c) {
//		System.out.println("\nYour physics score is " + p);
//		System.out.println("Your biology score is " + b);
//		System.out.println("Your chemistry score is " + c);
//		double total = ((p + b + c)*100)/450;
//		System.out.println("\nYour average percentage is " + total + "%");
//		return total;
//	}
}
