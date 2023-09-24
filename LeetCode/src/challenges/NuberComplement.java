package challenges;

public class NuberComplement {

	public static void main(String[] args) {
		Solution13 obj=new Solution13();
		System.out.println(obj.findComplement(2));
		// TODO Auto-generated method stub

	}

}

class Solution13 {
    public int findComplement(int num) 
    {
    	int number_of_bits =  
                (int)(Math.floor(Math.log(num) / 
                              Math.log(2))) + 1; 
   
         // XOR the given integer with poe(2, 
         // number_of_bits-1 and print the result 
         return ((1 << number_of_bits) - 1) ^ num; 
     } 
    
}