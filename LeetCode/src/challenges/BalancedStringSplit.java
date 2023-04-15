package challenges;

public  class BalancedStringSplit {
	public static int balancedStringSplit(String s) {
		int count=0;
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i) != s.charAt(i+1)) {
				count++;
				i=i+2;
			}
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		String  s = "RLRRRLLRLL";
		System.out.println(balancedStringSplit(s));
	}

}
