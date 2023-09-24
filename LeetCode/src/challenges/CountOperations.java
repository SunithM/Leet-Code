package challenges;

public class CountOperations {
	public static int countOperations(int num1, int num2) {
		int count=0;
		
		while(num1 >0 && num2 >0) {
			if(num1>num2) {
				num1=num1-num2;
				count++;
			} else if(num2>num1) {
				num2=num2-num1;
				count++;
			} else {
				num2=num1-num1;
				count++;
			}
		}
		
		return count;

	}

	public static void main(String[] args) {
		int num1=2;
		int num2=3;
		System.out.println(countOperations(num1,num2));
	}

}
