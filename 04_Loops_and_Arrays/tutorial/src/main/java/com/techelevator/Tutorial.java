package com.techelevator;

public class Tutorial {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int ix = 0; ix < numbers.length; ix++) {
            numbers[ix] = ix * 2;
        }

        int result = numbers[3];
        System.out.println(result);
    }
}
