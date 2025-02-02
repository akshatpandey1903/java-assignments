package NumberGame;

//package com.aurionpro;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guessedNumber;
        int numberOfGuesses = 0;

        while (true) {
            numberOfGuesses++;
            if (numberOfGuesses == 6) { // checking at 6 because updating at the start of the loop
                System.out.println("You have had more than 5 guesses, unlucky better luck next time");
                scanner.close();
                return;
            }
            System.out.print("Guess a number from between 1 to 100 : ");
            guessedNumber = scanner.nextInt();
            if (guessedNumber < randomNumber) {
                System.out.println("The entered number is LOWER than the actual number");
                System.out.println("Try again : ");
            } else if (guessedNumber > randomNumber) {
                System.out.println("The entered number is HIGHER than the actual number");
                System.out.println("Try again : ");
            } else {
                System.out.println("Congrats, You guessed the correct number!!");
                System.out.println("It took you " + numberOfGuesses + " attempts");
                scanner.close();
                break;
            }
        }
    }
}
