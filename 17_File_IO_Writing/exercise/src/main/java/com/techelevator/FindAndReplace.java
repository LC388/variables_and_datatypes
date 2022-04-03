package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class FindAndReplace {

    public static void main(String[] args) {

        //talk to user
        Scanner input = new Scanner(System.in);

        //prompt user for word and store
        System.out.println("What is the search word?");
        String searchWord = input.nextLine();

        //prompt user for replacement word and store
        System.out.println("What is the replacement word?");
        String replaceWith = input.nextLine();

        //what is source file and store
        System.out.println("What is the source file?");
        String filePath = input.nextLine();
        //create file and read path
        File toSearch = new File(filePath);

        //what is destination file? and store
        System.out.println("What is the destination file?");
        String destination = input.nextLine();
        File destinationFile = new File(destination);


        try (Scanner fileInput = new Scanner(toSearch);
             PrintWriter pw = new PrintWriter(destinationFile);) {
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                pw.write(line.replace(searchWord, replaceWith));
                pw.println();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("The file was not found, please try again later.");
        }


    }
}



