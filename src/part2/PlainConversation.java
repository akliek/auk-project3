package src.part2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Task 2.1 plain conversation.
 */
public class PlainConversation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("This program guessing your daily activity.");
		while (true)
		{
			System.out.print("Please enter a your age: ");
			try {
				int n = scanner.nextInt();
				System.out.print("Your probable activity - ");
				if (n < 0) {
					System.out.println("some God level stuff.");
				} else if (n <= 6) {
					System.out.println("home, walk and kindergarten.");
				} else if (n <= 17) {
					System.out.println("school.");
				} else if (n <= 22) {
					System.out.println("university.");
				} else if (n < 60) {
					System.out.println("work.");
				} else {
					System.out.println("retired.");
				}
				return;
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("\u001B[31mIt is not a number.\u001B[0m");
			}
		}
	}
}
