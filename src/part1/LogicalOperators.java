package src.part1;

/**
 * Task 1.4 logical operators.
 */
public class LogicalOperators {
	private static String getStringOne() {
		return "sample";
	}

	private static String getStringTwo() {
		return "example";
	}

	public static void main(String[] args) {
		String s1 = getStringOne();
		String s2 = getStringTwo();

		if (s1.length() > 2 && s2.length() <= 10) {
			System.out.printf("String \"%s\" is longer than 2 characters and " +
					"string \"%s\" is smaller or equal than 10 characters\n", s1, s2);
		}

		if (s1.contains("x") || s2.contains("x")) {
			System.out.printf("String \"%s\" or string \"%s\" contains character 'x'\n", s1, s2);
		}

		if (!s1.isEmpty()) {
			System.out.printf("String \"%s\" is not empty\n", s1);
		}
	}
}
