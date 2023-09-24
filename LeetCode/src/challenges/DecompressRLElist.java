package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRLElist {
	public static int[] decompressRLElist(int[] nums) {
		
		List<Integer> arrlist = new ArrayList<>();
		
		int n = 0, val, freq;
		while (n < nums.length) {
			// [1,2,3,4]
			val = nums[n+1];
			freq = nums[n];
			for(int i=0;i<freq;i++) {
				arrlist.add(val);
			}
			
			n=n+2;
		}
		int [] finalResult=new int [arrlist.size()];
		for(int i=0;i<arrlist.size();i++) 
			finalResult[i]=arrlist.get(i);
		return finalResult;	
		
		//System.out.println(Arrays.toString(rl));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,1,7,7,9,0,8,9999};
		System.out.println(Arrays.toString(decompressRLElist(nums)));

	}

}
