package challenges;

public class HalvesAreAlike {

	public static boolean halvesAreAlike(String s) {
		
		String h1 = s.substring(0, s.length() / 2);
		String h2 = s.substring(s.length() / 2, s.length());
		System.out.println(h1);
		System.out.println(h2);
		int h1vowels = countVowels(h1);
		int h2Vowels=countVowels(h2);
		return h1vowels==h2Vowels;
	}

	public static int countVowels(String s) {
		String word = s.toLowerCase();
		int count = 0;
		char[] chArray = word.toCharArray();

		for (int i = 0; i < chArray.length; i++) {
			if (chArray[i] == 'a' || chArray[i] == 'e' || chArray[i] == 'i' || chArray[i] == 'o' || chArray[i] == 'u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "tEextbookw";
		System.out.println(halvesAreAlike(s));

	}

}
