package mypackage;

import java.util.Arrays;

public class Testing {

	public static void main(String[] args) {
		System.out.println(Testing.getBomberString("abcdeedcbfgf"));
	}

	public static String getBomberString(String word) {
		char[] array = word.toCharArray();
		while (true) {
			int occurance = -1;
			char c = array[0];
			boolean flag = false;
			for (int counter = 1; counter < word.length(); counter++) {
				if (occurance == -1) {
					if (c == array[counter]) {
						occurance = counter-1;
					} else {
						c = array[counter];
					}
				} else {
					if (flag || c != array[counter]) {
						array[occurance++] = array[counter];
						flag = true;
					}
				}
			}
			if (occurance == -1) {
				break;
			}
			word = new String(Arrays.copyOfRange(array, 0, occurance));
		}
		return word;
	}
}
