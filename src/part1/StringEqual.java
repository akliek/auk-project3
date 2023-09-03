package src.part1;

/**
 * Task 1.3 String equals inside "if" statement.
 */
public class StringEqual {
	private static String getString() {
		return "sample";
	}

	public static void main(String[] args) {
		String s = "sample";

		if (s.equals(getString())) {
			System.out.printf("String \"%s\" is equal to string \"%s\"\n", s, getString());
		}
	}
}
