package challenges;

public class RansomeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution9 obj = new Solution9();
		String ransome = "aa";
		String magazine = "aabbc";
		System.out.println(obj.canConstruct(ransome, magazine));
		System.out.println('a');

	}

}

class Solution9 {
	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) {
			return false;
		}

		int[] cnt = new int[26];
		for (char c : magazine.toCharArray()) {
			cnt[c - 'a']++;
		}
		for (char c : ransomNote.toCharArray()) {
			if (cnt[c - 'a'] > 0) {
				cnt[c - 'a']--;
			} else {
				return false;
			}
		}
		return true;
	}
}