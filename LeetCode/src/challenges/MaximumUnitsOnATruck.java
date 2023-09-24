package challenges;

import java.util.Arrays;

public class MaximumUnitsOnATruck {
	public static int maximumUnits(int[][] boxTypes, int truckSize) {
		// Sort second column in descending order.
		Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
		int result = 0;
		for (int i = 0; i < boxTypes.length; i++) {
			if (boxTypes[i][0] <= truckSize) {
				result += boxTypes[i][0] * boxTypes[i][1];
				truckSize -= boxTypes[i][0];
			} else if (truckSize == 0) {
				break;
			} else {
				result += (truckSize) * boxTypes[i][1];
				break;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[][] boxTypes = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
		int truckSize = 10;
		System.out.println(maximumUnits(boxTypes, truckSize));
	}

}
