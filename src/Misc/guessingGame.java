package Misc;

import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    private static final int GUESSES_ALLOWED = -1;
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 100;

    private static int guess() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int guess = 0;
            System.out.print("Enter a guess > ");
            if(sc.hasNextInt()) {
                guess = sc.nextInt();
                if (guess >= LOWER_BOUND && guess <= UPPER_BOUND) {
                    return guess;
                } else {
                    System.err.println("Your guess is invalid");
                }
            } else {
                sc.next();
                System.err.println("Your guess is invalid");
            }
        }
    }
    public static void main(String[] args) {
        if(!(GUESSES_ALLOWED >= 1 || GUESSES_ALLOWED==-1)) {
            System.err.print("INVALID NUMBER OF GUESSES ALLOWED");
            System.exit(1);
        }
        Random rand = new Random();
        int number = rand.nextInt(UPPER_BOUND)+LOWER_BOUND;
        System.out.println("I have a secret number between "+LOWER_BOUND+" and "+UPPER_BOUND+". Can you guess it?");
        int guess;
        for (int i = 1; i <= GUESSES_ALLOWED || GUESSES_ALLOWED == -1; i++) {
            guess = guess();
            if (guess == number) {
                System.out.print("Congratulations! You guessed it! ");
                if(GUESSES_ALLOWED == -1) {
                    System.out.println("It took you "+i+" guesses to guess the number.");
                }
            } else {
                if (i == GUESSES_ALLOWED) {
                    System.out.println("Sorry, you didn't guess the number! The number was "+number);
                    if (Math.abs(number-guess) > 3) {
                        System.out.println("You missed by a mile!");
                    } else {
                        System.out.println("You were close.");
                    }
                    System.out.println("Better luck next time");
                } else {
                    System.out.print("Sorry, you didn't guess the number! ");
                    if (GUESSES_ALLOWED == -1) {
                        System.out.println("You have used "+i+" attempts.");
                    } else {
                        System.out.println("You have used "+i+" of your "+GUESSES_ALLOWED+" attempts.");
                    }
                    if(guess < number) {
                        System.out.println("Your guess is below the number.");
                    } else {
                        System.out.println("Your guess is above the number,");
                    }
                }
            }
        }
    }
}
