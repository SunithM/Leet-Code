package challenges;

public class PlusOneSol {

	private static int[] plusOnecalc(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

	public static void main(String[] args) {
//		int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		int[] digits = {7,9,9};
		int[] result;
		result = plusOnecalc(digits);
		for(int i=0;i<digits.length;i++)
			System.out.print(digits[i]);

	}

}
