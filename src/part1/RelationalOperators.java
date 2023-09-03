package src.part1;

/**
 * Task 1.2 relational operators.
 */
public class RelationalOperators {
	private static int getNumber() {
		return 0;
	}

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = getNumber();

		if (n1 * 0 == n2) {
			System.out.printf("%d * 0 is equal to %d\n", n1, n2);
		}

		if (n1 != n2) {
			System.out.printf("%d is not equal to %d\n", n1, n2);
		}

		if (n1 > n2) {
			System.out.printf("%d is bigger than %d\n", n1, n2);
		}

		if (n2 < n1) {
			System.out.printf("%d is smaller than %d\n", n2, n1);
		}

		if (n1 - 10 <= n2) {
			System.out.printf("%d - 10 is smaller or equal than %d\n", n1, n2);
		}

		if (n1 + 5 >= n2) {
			System.out.printf("%d + 5 is bigger or equal than %d\n", n1, n2);
		}
	}
}
