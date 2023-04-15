package challenges;

public class CheckOnesSegment {
	public static boolean checkOnesSegment(String s) {
		boolean res = true;
		char[] chaArray = s.toCharArray();
		if (s.length() == 1 || s.length() == 2) {
			return true;
		}

		for (int i = 0; i < s.length() - 1; i++) {
			if (chaArray[i] == '1' && chaArray[i + 1] == '1') {
				if(!res) {
					res=false;
					return res;
				}else {
					res = true;
				}
				
			} else if (chaArray[i] == '0' && chaArray[i + 1] == '1' && res) {
				if (i == s.length() - 2) {
					if (chaArray[i] == '0' && chaArray[i + 1] == '0') {
						return res;
					} else {
						res = false;
					}
						
				} else
					res = false;

			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "1001";
		System.out.println(CheckOnesSegment.checkOnesSegment(s));

	}

}
