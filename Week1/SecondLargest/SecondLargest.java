package SecondLargest;

//package com.aurionpro.array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int userInput = scanner.nextInt();

        // Handle edge case: If less than 2 elements, return an error message
        if (userInput < 2) {
            System.out.println("Array must have at least 2 elements.");
            scanner.close();
            return;
        }

        int userArray[] = new int[userInput];
        System.out.println("Enter numbers for the array:");

        for (int i = 0; i < userInput; ++i) {
            userArray[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < userInput; ++i) {
            if (userArray[i] > max) {
                secondMax = max;
                max = userArray[i];
            } else if (userArray[i] > secondMax && userArray[i] != max) {
                secondMax = userArray[i];
            }
        }

        scanner.close();

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest = " + secondMax);
        }
    }
}
