package challenges;

public class LogestSubArray {
	
	 public static int longestSubarray(int[] nums, int limit) {
		 int count=0;
		 int tempCount=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				if(Math.abs(nums[i]-nums[j])<=limit) {
					tempCount++;
				} else {
					if(tempCount>count) {
						count=tempCount;
					}else {
						tempCount=0;
					}
					break;
				}
			}
		}
		 return count;
	        
	    }
	public static void main(String[] args) {
		int[] nums = {8,2,4,7};
		int limit = 4;
		System.out.println(longestSubarray(nums,limit));
	}

}
