package com.array.examples;

import java.util.Scanner;

public class FindOddEvenNumber {

    public static void main(String[] args) {
        int[] numbers = {23, 4, 5, 6, 7, 8, 9, 1, 0, 1, 2, 31, 2, 4, 2};

        int evenCount = 0;
        for (int number : numbers){
            if(number % 2 == 0){
                evenCount++;
            }
        }

        int [] evenNumbers = new int[evenCount];
        int index = 0;

        for (int number : numbers) {
            if(number % 2 == 0){
                evenNumbers[index++] = number;
            }
        }
        System.out.println("Even numbers:");
        for (int even : evenNumbers){
            System.out.print(even+" ");
        }
    }
}
