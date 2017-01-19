package Questions;

public class findSubString {

	public static void main(String... args) {
		System.out.println(isSubString("abaaabc", "abc"));
	}

	private static boolean isSubString(String main, String test) {
		int testCounter = 0;
		for (int counter = 0; counter < main.length(); counter++) {
			if (main.charAt(counter) == test.charAt(testCounter)) {
				if (++testCounter == test.length()) {
					return true;
				}
			} else {
				testCounter = main.charAt(counter) == test.charAt(0) ? 1 : 0;
			}

			if ((counter > main.length() - test.length() - 1 && testCounter == 0)) {
				return false;
			}
		}
		return false;
	}
}