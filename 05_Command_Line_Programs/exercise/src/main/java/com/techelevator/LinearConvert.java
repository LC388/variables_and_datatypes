package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the length: ");
		int length = input.nextInt();

		System.out.print("is the measurement in (m)eters or (f)eet? ");
		String measureBy = input.next();

		if (measureBy.equals("M") || measureBy.equals("m")) {
			String lengthConverted= String.valueOf(meterConversion(length));
			System.out.print(length + "m is " + lengthConverted + "f");
		} else if (measureBy.equals("F") || measureBy.equals("f")) {
			String lengthConverted = String.valueOf(feetConversion(length));
			System.out.print(length + "f is " + lengthConverted + "m");
		}

	}

	public static int feetConversion(int feet){
		double m = feet * 0.3048;
		return (int) m;
	}

	public static double meterConversion(int meter){
		double f = meter * 3.2808399;
		return (int) f;
	}
}

