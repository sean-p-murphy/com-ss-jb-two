package com.ss.jb.two.two;
import java.util.Random;
import java.util.Scanner;

public class TwoApplication {
	int number;
	int guessCount;

	public TwoApplication() {
		Random rand = new Random();
		number = rand.nextInt(100);
		number++;
		guessCount = 0;
	};

	public static void main(String[] args) {
		TwoApplication two = new TwoApplication();
		System.out.println("Please input your guess!");
		two.inputGuess();
	};

	public void inputGuess() {
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		this.guessCount++;
		if (this.guessCount > 5) {
			this.giveUp();
		} else if (guess >= this.number - 10 && guess <= this.number + 10) {
			this.success();
		} else {
			this.tryAgain();
		};
	};

	public void success() {
		System.out.print("Close enough! The number was ");
		System.out.print(this.number);
		System.out.println(".");
	};

	public void tryAgain() {
		System.out.print("Not quite. Give it another guess you have ");
		System.out.print(5 - this.guessCount);
		System.out.println(" guesses left.");
		this.inputGuess();
	};

	public void giveUp() {
		System.out.print("Sorry, you are out of guesses. The number we were looking for is ");
		System.out.print(this.number);
		System.out.println(".");
	}

}
