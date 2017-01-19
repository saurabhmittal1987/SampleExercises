package Questions;

public class findSubString {

	public static void main(String... args) {
		System.out.println(isSubString("abaaabc", "abc"));
	}

	/**
	 * Check whether a string is substring of another string or not
	 * @param mainString
	 * @param testString
	 * @return
	 */
	private static boolean isSubString(String mainString, String testString) {
		int testCounter = 0;
		for (int counter = 0; counter < mainString.length(); counter++) {
			/**
			 * If string is matching the characters, we are pushing the counter to
			 * check next subsequent character. If length of matching chars in now
			 * equal to length, we have found the substring
			 */
			if (mainString.charAt(counter) == testString.charAt(testCounter)) {
				if (++testCounter == testString.length()) {
					return true;
				}
			} else {
				/**
				 * If any character doesn't matches the corresponding character
				 * or substring matching break in mid, reset the counter, but if
				 * the break point is first char of test string, rest counter to 1
				 */
				testCounter = mainString.charAt(counter) == testString.charAt(0) ? 1 : 0;
			}

			if ((counter > mainString.length() - testString.length() - 1 && testCounter == 0)) {
				return false;
			}
		}
		return false;
	}
}