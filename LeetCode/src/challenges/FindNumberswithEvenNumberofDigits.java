package challenges;

public class FindNumberswithEvenNumberofDigits {

	public static int findNumbers(int[] nums) {
		int dCount = 0;
		int evenCount = 0;
		// nums = [12,345,2,6,7896];
		for (int i = 0; i < nums.length; i++) {
			dCount = 0;
			while (nums[i] > 0) {
				nums[i] = nums[i] / 10;
				dCount++;
			}
			if (dCount % 2 == 0) {
				evenCount++;
			}
		}

		return evenCount;

	}

	public static void main(String[] args) {
		int nums[] = { 1, 78, 90 };
		System.out.println(FindNumberswithEvenNumberofDigits.findNumbers(nums));
	}

}
