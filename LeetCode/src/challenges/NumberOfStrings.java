package challenges;

public class NumberOfStrings {
	public static int numOfStrings(String[] patterns, String word) {
		int result=0;
		
		for(String pattern :patterns) {
			if(word.contains(pattern)) {
				result++;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		String []patterns = {"a","a","a"};
		String word = "ab";
		System.out.println(numOfStrings(patterns,word));
	}

}
