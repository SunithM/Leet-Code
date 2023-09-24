package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateTargetArray {
public static int[] createTargetArray(int[] nums, int[] index) {
	List<Integer> array=new ArrayList<>();
	for(int i=0;i<nums.length;i++) {
		array.add(index[i], nums[i]);
	}
	for(int i=0;i<nums.length;i++) {
		nums[i]=array.get(i);
	}
	Collections.sort(array);
	return nums;
}
	public static void main(String[] args) {
		int[] index= {0,1,2,2,1};
int[] nums= {0,1,2,3,4};
// TODO Auto-generated method stub
System.out.println(Arrays.toString(CreateTargetArray.createTargetArray(nums, index)));
	}

}
