package IfSubstring;

//package com.aurionpro.hw;

import java.util.Scanner;

public class FindSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String userString = scanner.next();

        System.out.println("Enter another string to check if it is a substring of the earlier string :");
        String substringToFind = scanner.next();

        if (userString.length() < substringToFind.length()) {
            System.out.println("Error, The substring you are trying to find is larger than the actual string!");
            scanner.close();
            return;
        }

        int substringCount = 0;
        for (int i = 0; i < userString.length(); ++i) {
            if (userString.charAt(i) == substringToFind.charAt(substringCount)) {
                substringCount++;
            } else {
                substringCount = 0;
            }
            if (substringCount == substringToFind.length()) {
                System.out.println("The substring is present in the String");
                scanner.close();
                return;
            }
        }

        System.out.println("The String does not contain the entered substring");

        scanner.close();
    }
}
