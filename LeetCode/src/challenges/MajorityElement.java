package challenges;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] array = { 1};
		majorityElement(array);
	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> mapVal = new HashMap<>();
		int maxValue = 1;
		int maxKey=1;
		for (int i = 0; i < nums.length; i++) {
			if (mapVal.containsKey(nums[i])) {
				Integer count = mapVal.get(nums[i]);
				mapVal.put(nums[i], count + 1);
				if (count >= maxValue) {
					maxValue = count+1;
					maxKey=nums[i];
				}

			} else {
				mapVal.put(nums[i], 1);
			}
		}
	System.out.println(maxKey);
		return maxKey;

	}

}
