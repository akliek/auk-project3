package src.part1;

/**
 * Task 1.1 control statements.
 */
public class ControlStatements {
	private static String   getString() {
		return "sample";
	}

	public static void main(String[] args) {
		String s = getString();

		if (s.length() > 5) {
			System.out.printf("The string - \"%s\" - is longer than 5 characters\n", s);
		} else {
			System.out.printf("The string - \"%s\" - is shorter/equal than 5 characters\n", s);
		}

		if (!s.contains("s")) {
			System.out.printf("The string - \"%s\" - doesn't contain character 's'\n", s);
		} else {
			System.out.printf("The string - \"%s\" - contains character 's'\n", s);
		}

		switch (s.length()) {
			case 2 -> System.out.printf("The string - \"%s\" - is 2 characters long\n", s);
			case 4 -> System.out.printf("The string - \"%s\" - is 4 characters long\n", s);
			case 6 -> System.out.printf("The string - \"%s\" - is 6 characters long\n", s);
			default -> System.out.printf("The string - \"%s\" - is not 2 nor 4 nor 6 characters long\n", s);
		}
	}
}
