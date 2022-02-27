package com.techelevator;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String limit = userInput.nextLine();

		int number = Integer.parseInt(limit);
		int previous = 1;
		System.out.print("0,1");

		for (int next = 1; next <= number;){
			System.out.print(", " +next);
			int temp = previous+next;
			previous=next;
			next = temp;
		}
	}
}

