package guessingGame;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secretNumber = (int) (Math.random() * 10);
		int numGuesses = 4;
//		System.out.println(secretNumber);

		System.out.println("Welcome to the Guessing Game!");
		System.out.println("You will get " + numGuesses + " guesses.");
		System.out.print("Pick a number between 1 - 10: ");

		boolean correctGuess = false;
		for (int i = 1; i <= numGuesses; i++) {
			int guess = input.nextInt();

			if (secretNumber == guess) {
				System.out.println("You have guessed the secret number!");
			} else {
				System.out.println("That's not it!");
			}

		}

		input.close();
	}

}
