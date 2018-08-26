package guessingGame;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secretNumber = (int) (Math.random() * 10 + 1);
		int guessesAllowed = 4;
		
//		System.out.println(secretNumber);

		System.out.println("Welcome to the Guessing Game!");
		System.out.println("You will get " + guessesAllowed + " guesses.");

		int numGuesses = 0;
		boolean correctGuess = false;
		for (int i = 1; i <= guessesAllowed; i++) {
			System.out.print("Pick a number between 1 - 10: ");
			int guess = input.nextInt();
			numGuesses++;

			if (secretNumber == guess) {
				System.out.println("You have guessed the secret number!");
				correctGuess = true;
				break;
			} else {
				System.out.println("That's not it!");
			}

		}
		
		if (correctGuess) {
			System.out.println("You guessed the number correctly in " + numGuesses + " guesses.");
		} else {
			System.out.println("Unfortunately you did not guess the number, which was " + secretNumber);
		}

		input.close();
	}

}
