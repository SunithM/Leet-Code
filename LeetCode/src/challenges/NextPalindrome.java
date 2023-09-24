package challenges;

public class NextPalindrome {

	public static int nextPali(int N) {
		N=N+1;
		int result=0;
		while(N>0) {
			if(isPali(N)) {
				result=N;
				break;
			} else {
				N++;
			}
		}
		return result;
	}
	public static boolean isPali(int N) {
		int rev=0;
		int sum=0;
		int temp=N;
		while(N>0) {
			rev=N%10;
			sum=(sum*10)+rev;
			N=N/10;
		}
		if(temp==sum) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println("Result:"+nextPali(124));
	}

}
