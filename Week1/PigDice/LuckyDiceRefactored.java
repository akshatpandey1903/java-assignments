package PigDice;

//package com.aurionpro;

import java.util.Random;
import java.util.Scanner;

public class LuckyDiceRefactored {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's Start Rolling!");
        int currentTotal = 0;
        int turnCount = 1;

        while (currentTotal < 20) {
            int turnScore = 0;
            System.out.println("TURN " + turnCount);

            String diceDecision = "";
            while (!diceDecision.equalsIgnoreCase("h")) {
                System.out.print("Do you want to roll or hold? (R/H): ");
                diceDecision = scanner.nextLine();

                if (diceDecision.equalsIgnoreCase("r") || diceDecision.equalsIgnoreCase("roll")) {
                    int diceOutput = random.nextInt(6) + 1;
                    System.out.println("You rolled: " + diceOutput);

                    if (diceOutput == 1) {
                        System.out.println("Turn Over! :( You lose the points for this turn.");
                        currentTotal -= turnScore;
                        break;
                    }

                    turnScore += diceOutput;
                    currentTotal += diceOutput;

                    System.out.println("Turn score: " + turnScore);
                    System.out.println("Total score: " + currentTotal);

                }

            }
            if (currentTotal >= 20) {
                System.out.println("You reached 20! Game over!");
                System.out.println("You finished in " + turnCount + " turns.");
                scanner.close();
                return;
            }

            System.out.println("Total score after TURN " + turnCount + ": " + currentTotal);
            turnCount++;
        }
        scanner.close();
    }
}
