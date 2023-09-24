package challenges;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 obj=new Solution2();
		int [] nums= {0,2,5,0,7,0,9,8};
		obj.moveZeroes(nums);

	}

}

class Solution2 {
    public void moveZeroes(int[] nums) {
    	int nzero=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
            	nums[++nzero]=nums[i];
            }
            
        }
        
        for(int i=nzero+1;i<nums.length;i++)
        {
        	nums[i]=0;
        	
        }
        for(int i=0;i<nums.length;i++)
        	System.out.println(nums[i]);
    }
}