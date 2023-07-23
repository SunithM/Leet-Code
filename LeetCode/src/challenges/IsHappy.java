package challenges;

public class IsHappy {

	public static void main(String[] args) {

		System.out.println(isHappy(1111111));
	}

	public static boolean isHappy(int n) {

		while (n > 0) {
			n = sumOfSquqredigit(n);
			if (n < 9 && n != 1 && n != 7) {
				return false;
			}
			if (n == 1) {
				return true;
			}
		}

		return false;

	}

	public static int sumOfSquqredigit(int num) {
		int sum = 0;
		int digit;
		while (num > 0) {
			digit = num % 10;
			sum = sum + digit * digit;
			num = num / 10;
		}
		return sum;

	}

}
