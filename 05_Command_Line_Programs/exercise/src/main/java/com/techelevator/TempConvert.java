package com.techelevator;

import java.util.Scanner;

public class TempConvert {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");
		int tempIn = input.nextInt();

		System.out.print("is the temperature in (C)elsius or (F)ahrenheit? ");
		String measureBy = input.next();

		if (measureBy.equals("F") || measureBy.equals("f")) {
			String tempConverted = String.valueOf(fahrenheitConversion(tempIn));
		System.out.print(tempIn + "F is " + tempConverted + "C");
		} else if (measureBy.equals("C") || measureBy.equals("c")) {
			String tempConverted = String.valueOf(celsiusConversion(tempIn));
			System.out.print(tempIn + "C is " + tempConverted + "F");
		}

	}

	public static int fahrenheitConversion(int fahrenheit){
	double celsius = (fahrenheit - 32) / 1.8;
	return (int) celsius;
	}

	public static double celsiusConversion(int celsius){
		double fahrenheit = celsius * 1.8 + 32;
		return (int) fahrenheit;
	}
}


