package challenges;

public class ArrayConcate {
	public static int[] getConcatenation(int[] nums) {
		int len=nums.length;
		int res[]=new int[len*2];
		for(int i=0;i<len;i++) {
			res[i]=nums[i];
			res[i+len]=nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums= {1,3,2,1};
		int[] res=getConcatenation(nums);
		for(int i=0;i<res.length;i++)
		System.out.println(res[i]);
		
	}

}
