package challenges;

public class AddTwoStringInt {
	public static int convert(String num) {
		int inum=0;
		for(int i=0;i<num.length();i++) {
			inum=inum*10+((int)num.charAt(i)-48);
		}
		return inum;
	}
	public static String addString(String num1,String num2) {
		int inum1=convert(num1);
		int inum2=convert(num2);
		int sum=inum1+inum2;
		return Integer.toString(sum);
	}
	public static void main(String[] args) {
		String num1="25";
		String num2="30";
		System.out.println(addString(num1,num2));
		

	}

}
