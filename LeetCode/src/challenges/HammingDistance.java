package challenges;

class HammingDistance
{
	public static void main(String asgs[])
	{
		Solution11 obj=new Solution11();
		
		System.out.println(obj.hammingDistance(15, 1));
	}
}

class Solution11 {
	public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0; 
        while (n > 0) { 
            count += n & 1; 
            n >>= 1; 
        } 
        return count; 
    }

}
