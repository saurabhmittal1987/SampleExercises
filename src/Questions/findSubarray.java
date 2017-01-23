package Questions;

import java.util.Arrays;

public class findSubarray {

	public static void main(String... args) {
		int[] array = { -10, 0, 5, 10, 15, 20, 30 };
		findSubString(array, 20);
	}

	private static void findSubString(int[] array, int arraySum) {
		for (int counter1 = 0; counter1 < array.length; counter1++) {
			int sum = array[counter1];
			checkSum(sum, arraySum, counter1, counter1, array);
			for (int counter2 = counter1 + 1; counter2 < array.length; counter2++) {
				sum += array[counter2];
				checkSum(sum, arraySum, counter1, counter2, array);
			}
		}
	}

	private static void checkSum(int sum, int arraySum, int counter1, int counter2, int[] array) {
		if (sum == arraySum) {
			System.out.println(Arrays.toString(Arrays.copyOfRange(array, counter1, counter2 + 1)));
		}
	}
}
