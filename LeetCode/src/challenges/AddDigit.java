package challenges;

public class AddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 obj=new Solution3();
		System.out.println(obj.addDigits(60900));

	}

}

class Solution3 {
    public int addDigits(int num) {
        int temp=0;
        int digit=0;
        while(num/10!=0 || num%10!=0 )
        {
            temp=num%10;
            num=num/10;
            digit=temp+digit;
            
        }
        if (digit>9)
        return	addDigits(digit);
        else
        return digit;
    }
}
