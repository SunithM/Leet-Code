package challenges;
import java.util.Scanner;

class IntPali {
    public boolean isPalindrome(int x) {
        long rev=0;
        int temp=x;
        boolean neg=false;
        /*if(x<0)
        {    
        	System.out.println("From left to right, it reads"+x+ ". From right to left, it becomes" +x*-1+"-. Therefore it is not a palindrome.");
        	neg=true;
        }
        */
        while(temp!=0 || neg)
        {
            rev=(rev*10)+(temp%10);
            temp=temp/10;
        }
        if(x>= Integer.MAX_VALUE || x<= Integer.MIN_VALUE)
            return false;
        else if(x==rev && x>0)
            return true;
        else if((x)==rev && x<0)
        {
        	System.out.println("From left to right, it reads"+x+ ". From right to left, it becomes" +x*-1+"-. Therefore it is not a palindrome.");
        	return false;  
        }
        else if(x==0)
        	return true;
        else 
        	return false;
                
    }
}
public class IntegerPalindrome {
	public static void main(String args[])
	{
		IntPali ob=new IntPali();
		int x;
		Scanner console = new Scanner(System.in);
        System.out.print("Integer to reverse :");
        x = console.nextInt();
		System.out.println(ob.isPalindrome(x));
		console.close();
	}
	

}
