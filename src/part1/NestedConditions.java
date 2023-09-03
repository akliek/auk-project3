package src.part1;

/**
 * Task 1.6 nested conditions.
 */
public class NestedConditions {
	private static String getString () {
		return "sample";
	}

	public static void main(String[] args) {
		String s = getString();

		if (!s.isEmpty()) {
			System.out.printf("The string \"%s\" is not empty\n", s);
			if (s.contains("s")) {
				System.out.printf("The string \"%s\" contains character 's'\n", s);
			}
		} else {
			System.out.println("The string is empty!");
		}
	}
}
