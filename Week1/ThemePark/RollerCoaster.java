package ThemePark;

//package com.aurionpro;

import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {
        System.out.println("Let's see if you are eligible to ride on the roller coaster");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height(in cm) : ");
        int userHeight = scanner.nextInt();
        int userAge, totalBill = 0;

        if (userHeight <= 120) {
            System.out.println("You are too short to go on the ride.");
        } else {
            System.out.print("Enter your age : ");
            userAge = scanner.nextInt();

            if (userAge < 12) {
                totalBill += 5;
            } else if (userAge >= 12 && userAge <= 18) {
                totalBill += 7;
            } else if (userAge >= 45 && userAge <= 55) {
                totalBill += 0;
            } else if (userAge > 55) {
                System.out.println("You are too old to ride :(");
                scanner.close();
                return;
            } else {
                totalBill += 12;
            }

            scanner.nextLine();

            System.out.print("Do you want photos of you on the ride (Y/N) : ");
            String photoChoice = scanner.nextLine();

            if (photoChoice.equalsIgnoreCase("y") || photoChoice.equalsIgnoreCase("yes")) {
                totalBill += 3;
            }

            System.out.println("Your total cost for the Ride is " + totalBill + "$");
        }
        scanner.close();
    }
}
