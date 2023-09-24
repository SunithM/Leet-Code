package challenges;

public class NumOfSubarrays {
	public static int numOfSubarrays(int[] arr) {
		int sum = 0;
		int count = 0;
		int end=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (i == j) {
					sum = arr[i];
					if (sum % 2 == 1) {
						System.out.println(sum);
						count++;
						sum = 0;
					}
					sum=0;

				} else {
					if (end == 0)
						sum = arr[i] + arr[j];
					else
						sum = sum + arr[j];
					if (sum % 2 == 1) {
						System.out.println(sum);
						count++;
						end=1;
					}

					if (j > arr.length) {
						end = 1;
					}
				}

			}
			if (sum % 2 == 1) {
				System.out.println(sum);
				count++;
				sum=0;
			}

			sum = 0;
		}
		return count;

	}

	public static void main(String[] args) {
		int[] arr = { 100,100,99,99};
		System.out.println(numOfSubarrays(arr));

	}

}
