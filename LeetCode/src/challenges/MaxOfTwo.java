package challenges;

public class MaxOfTwo {
	public static void main(String args[])
	{
		    Test1 ob=new Test1();
		    int [] nums= {2,2,8,9,7,6};
		    System.out.println(ob.maxProduct(nums));
	}

}

class Test1
{
	public int maxProduct(int[] nums) 
    {
         int max1 = Integer.MIN_VALUE, max2 = max1;
        for (int num: nums) 
        {
            if (num >= max1)
            {
                max2 = max1;
                max1 = num;
            }else if (num > max2) 
            {
                max2 = num;
            }
        } 
        return (max1 - 1) * (max2 - 1);
    }
}

