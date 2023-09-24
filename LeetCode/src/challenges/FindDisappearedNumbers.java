package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class FindDisappearedNumbers {

	public static List<Integer> findDisappearedNumbersH(int[] nums) {
		List<Integer> result=new ArrayList<>();
		HashSet hasSet=new HashSet<>();
		for(int i=0;i<nums.length;i++) 
			hasSet.add(nums[i]);
		for(int i=1;i<=nums.length;i++) {
			if(!hasSet.contains(i)) {
				result.add(i);
			}
		}
		
		return result;
		
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 1; i <= nums.length; i++) {
			final int f = i;
			boolean test = IntStream.of(nums).anyMatch(x -> x == f);
			if (!test) {
				result.add(i);
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int nums[] = { 1, 1 };
		System.out.println(findDisappearedNumbersH(nums));
	}

}
