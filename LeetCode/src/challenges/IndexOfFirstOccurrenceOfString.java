package challenges;

public class IndexOfFirstOccurrenceOfString {
	public static int strStr(String haystack, String needle) {
		int result=haystack.indexOf(needle);
		return result;

	}

	public static void main(String[] args) {
		String haystack="leetcodeleet";
		String needle="leet";
		int result=strStr(haystack,needle);
		System.out.println(result);
	}

}
