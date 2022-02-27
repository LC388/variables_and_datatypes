package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String intString = input.nextLine();
		String [] intArr = intString.split(" ");
		for (int i = 0; i < intArr.length; i++){
			int binary = Integer.parseInt(intArr[i]);
			System.out.println(binary + " in binary " + Integer.toBinaryString(binary));
		}
	}
	}
