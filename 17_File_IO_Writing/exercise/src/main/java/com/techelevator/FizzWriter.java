package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is the destination file?");
		String destination = input.nextLine();
		File destinationFile = new File(destination);



		try (PrintWriter fizzBuzzWriter = new PrintWriter(destinationFile)){
			for (int i = 1; i <= 300; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					fizzBuzzWriter.println("FizzBuzz");// is number divisible by 3 && 5 fizzbuzz
				}
				else if (i % 5 == 0) {
					fizzBuzzWriter.println("Buzz");//is number divisible by 5 buzz
				}
				else if (i % 3 == 0) {
					fizzBuzzWriter.println("Fizz");//is number divisible by 3 fizz
				} else {
					fizzBuzzWriter.println(i);
				}
			}
		} catch (IOException e) {
			System.out.println("File destination not found");
		}



	}
}
