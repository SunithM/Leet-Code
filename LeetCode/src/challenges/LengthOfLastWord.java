package challenges;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		String[] newStr=s.split("\\s+");
		System.out.println(newStr[newStr.length-1].length());
		return 0;
	}
	public static void main(String[] args) {
		String s="   fly me   to   the moon  ";
		lengthOfLastWord(s);
	}

}
