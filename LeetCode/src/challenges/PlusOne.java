package challenges;

import java.math.BigInteger;

public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
//		int[] digits = {7,2,8};
		int[] result;
		result = plusOnecalc(digits);
		System.out.println(result.toString());
	}

	private static int[] plusOnecalc(int[] digits) {
		BigInteger  val = BigInteger.ZERO;
	
		boolean isLastMax=true;
		int length=digits.length;
		for (int i = 0; i < digits.length; i++) {
			/*
			 * BigInteger power=(Math.pow(10, length - 1 - i); val =val.add(
			 * BigInteger.valueOf(digits[i] * (Math.pow(10, length - 1 - i)))); //
			 * System.out.println(val); if(digits[i]!=9 && isLastMax) { isLastMax=false; }
			 */}
		val=val.add(BigInteger.ONE);
		System.out.println(val);

		int digit;
		int index = isLastMax?digits.length :digits.length - 1;
		int[] result = isLastMax?new int [digits.length+1]:new int [digits.length];
		while (val.compareTo(BigInteger.ZERO) !=0) {
			digit = val.mod(BigInteger.TEN).intValueExact();
			val = val.divide(BigInteger.TEN);
			result[index--] = digit;
			
		}
		return result;

	}

}
