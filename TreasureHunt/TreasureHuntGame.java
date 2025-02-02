//package com.aurionpro;

import java.util.Scanner;

public class TreasureHuntGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We will begin our journey to find the treasure!");

        System.out.print("You are at a diverging path, enter either left or right to move forward : ");
        String firstOptionDirection = scanner.nextLine();
        String secondOptionPond = "";
        String thirdOptionDoor = "";

        if (!firstOptionDirection.equalsIgnoreCase("left")) {
            System.out.println("You fell into a Hole, Game Over :(");
        } else {
            System.out.print("You come across a pond, enter if you want to swim or wait : ");
            secondOptionPond = scanner.nextLine();
            if (!secondOptionPond.equalsIgnoreCase("wait")) {
                System.out.println("You got attacked by a trout, Game Over :(");
            } else {
                System.out.print(
                        "You are suddenly presented with an option to choose from 3 doors - Red, Yellow or Green, enter your option : ");
                thirdOptionDoor = scanner.nextLine();
                if (thirdOptionDoor.equalsIgnoreCase("red")) {
                    System.out.println("Burned by fire, Game Over :(");
                } else if (thirdOptionDoor.equalsIgnoreCase("yellow")) {
                    System.out.println("You win!!!");
                } else if (thirdOptionDoor.equalsIgnoreCase("blue")) {
                    System.out.println("Eaten by beasts, Game over :(");
                } else {
                    System.out.println("You didnt pick any of the options, Game over :(");
                }
            }
        }
        scanner.close();
    }
}
