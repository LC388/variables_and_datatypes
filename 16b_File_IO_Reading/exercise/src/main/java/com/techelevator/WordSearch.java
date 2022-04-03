package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		//collect user input and perform search
		Scanner userInput = new Scanner(System.in);

		//prompt for file system path
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String filePath = userInput.nextLine();
		//create file and read path
		File toSearch = new File(filePath);
		//prompt user for word to be searched
		System.out.println("What word are you seeking?");
		String findWord = userInput.nextLine();

		//should it be cases sensitive
		System.out.println("Should this search be case sensitive? (Y/N)");
		String caseSensitivity = String.valueOf(userInput.next().charAt(0));


		//handle FNF e
		// Open the file
		int count = 0;//count lines


		try (Scanner fileInput = new Scanner(toSearch)) {
			while (fileInput.hasNextLine()) {
				count++;
				String line = fileInput.nextLine();
				String[] words = line.split(" ");
				if (caseSensitivity.equalsIgnoreCase("y")) {
					for (String word : words) {
						if (findWord.equals(word)) {
							System.out.println(count+ ") " + line);
						}
					}
				} if(caseSensitivity.equalsIgnoreCase("n")){
					for (String word : words){
						if (findWord.equalsIgnoreCase(word)){
							System.out.println(count+ ") " + line);
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found, please try again later.");
		}

	}
}