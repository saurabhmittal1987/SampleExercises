package questions;

public class TrappingRainWater {

	public static void main(String... args) {
		TrappingRainWater trappingRainWater = new TrappingRainWater();
		int[] array = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trappingRainWater.getTrappingWaterQuantity(array));
	}

	public int getTrappingWaterQuantity(int[] array) {
		int buffer = 0, sum = 0;
		int start = -1;
		boolean increaseDetected = false, decreaseDetected = false;
		for (int counter = 0; counter < array.length; counter++) {
			System.out.println(
					"1. counter: " + counter + ", increaseDetected: " + increaseDetected + ", decreaseDetected: "
							+ decreaseDetected + ", buffer:" + buffer + ",sum: " + sum + ",start: " + start);
			if (start == -1) {
				System.out.println(
						"2. counter: " + counter + ", increaseDetected: " + increaseDetected + ", decreaseDetected: "
								+ decreaseDetected + ", buffer:" + buffer + ",sum: " + sum + ",start: " + start);
				start = counter;
				continue;
			} else if (array[counter] > array[counter - 1]) {
				System.out.println(
						"3. counter: " + counter + ", increaseDetected: " + increaseDetected + ", decreaseDetected: "
								+ decreaseDetected + ", buffer:" + buffer + ",sum: " + sum + ",start: " + start);
				increaseDetected = true;
			} else if (increaseDetected && array[counter] < array[counter - 1]) {
				System.out.println(
						"4. counter: " + counter + ", increaseDetected: " + increaseDetected + ", decreaseDetected: "
								+ decreaseDetected + ", buffer:" + buffer + ",sum: " + sum + ",start: " + start);
				decreaseDetected = true;
				increaseDetected = false;
			}

			if (decreaseDetected) {
				System.out.println(
						"5. counter: " + counter + ", increaseDetected: " + increaseDetected + ", decreaseDetected: "
								+ decreaseDetected + ", buffer:" + buffer + ",sum: " + sum + ",start: " + start);
				sum += buffer - (Math.abs(array[counter - 1] - array[start]) * (counter - 1 - start));
				start = counter - 1;
				buffer = (array[start] - array[counter]);
				decreaseDetected = false;
			} else if (counter == array.length - 1) {
				System.out.println(
						"6. counter: " + counter + ", increaseDetected: " + increaseDetected + ", decreaseDetected: "
								+ decreaseDetected + ", buffer:" + buffer + ",sum: " + sum + ",start: " + start);
				sum += buffer - (Math.abs(array[counter] - array[start]) * (counter - start));
				buffer = 0;
			} else {
				System.out.println(
						"7. counter: " + counter + ", increaseDetected: " + increaseDetected + ", decreaseDetected: "
								+ decreaseDetected + ", buffer:" + buffer + ",sum: " + sum + ",start: " + start);
				buffer += (array[start] - array[counter]);
			}

		}
		return sum;
	}
}
