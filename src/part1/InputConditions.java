package src.part1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Task 1.5 conditions with user input.
 */
public class InputConditions {
	private static void isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println("\u001B[33mThe number is NOT prime!\u001B[0m");
				return;
			}
		}
		System.out.println("\u001B[32mThe number is prime!\u001B[0m");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("This program check if a number is prime.");
		while (true) {
			System.out.print("Please enter a natural number: ");
			try {
				int n = scanner.nextInt();

				if (n <= 0) {
					System.out.println("\u001B[31mThe number is not valid.\u001B[0m");
					continue;
				} else if (n == 1) {
					System.out.println("\u001B[33mThe number is NOT prime!\u001B[0m");
				} else {
					isPrime(n);
				}

				scanner.nextLine();
				System.out.print("Enter 'Y' or 'y' to continue: ");
				String s = scanner.nextLine();
				if (s.equals("Y") || s.equals("y")) {
					continue;
				}
				return;
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("\u001B[31mIt is not a number.\u001B[0m");
			}
		}
	}
}
