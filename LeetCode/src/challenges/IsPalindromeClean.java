package challenges;

public class IsPalindromeClean {
	
	public static boolean isPlandrome(String s) {
	String newString =s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
	System.out.println(newString);
	char[] chrString=newString.toCharArray();
	int len=newString.length();
	for(int i=0;i<len;i++) {
		if(chrString[i]!=chrString[len-i-1]) return false;
	}
	return true;
	}
	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		System.out.println(isPlandrome(s));
	}

}
