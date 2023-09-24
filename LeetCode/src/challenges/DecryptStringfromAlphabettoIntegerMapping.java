package challenges;

public class DecryptStringfromAlphabettoIntegerMapping {
	public static String freqAlphabets(String s) {
		String result = "";
		char[] chArray = s.toCharArray();
		int i = 0;
		int len = chArray.length;
		String[] code1 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x","y", "z" };
		while (i < len) {
			if (i <= len - 3) {
				if (s.substring(i, i + 3).endsWith("#")) {
					int pos1 = Integer.parseInt(s.substring(i, i + 2));

					result = result + code1[pos1 - 1];
					
					i = i + 3;
				}

				else {
					int pos = Integer.parseInt(s.substring(i, i + 1));
					result = result + code1[pos - 1];
					
					i++;
				}

			}
			else {
				int pos = Integer.parseInt(s.substring(i, i + 1));
				result = result + code1[pos - 1];
				
				i++;
			}
			
		}

		return result;

	}

	public static void main(String[] args) {
		String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
		System.out.println(freqAlphabets(s));

	}

}
