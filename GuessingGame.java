package guessingGame;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secretNumber = (int)(Math.random() * 10);
//		System.out.println(secretNumber);
		
		System.out.println("Welcome to the Guessing Game!");
		System.out.print("Pick a number between 1 - 10: ");
		int guess = input.nextInt();
		
		if (secretNumber == guess) {
			System.out.println("You have guessed the secret number!");
		} else {
			System.out.println("That's not it!");
		}
		
		
		
		input.close();
	}

}
