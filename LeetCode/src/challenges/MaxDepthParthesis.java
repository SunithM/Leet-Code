package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxDepthParthesis {

	public static int maxDepth(String s) {

		char[] chAry = s.toCharArray();
		int maxLength = 0;
		int count = 0;
		List<Integer> countList = new ArrayList<>();
		for (int i = 0; i < chAry.length; i++) {
			if (chAry[i] == '(') {
				count++;
			}
			if (chAry[i] == ')') {
				countList.add(count);
				count--;
			}
			if (count == 0 && i == chAry.length - 1) {
				if (!countList.isEmpty()) {
					maxLength = Collections.max(countList);
				} else {
					maxLength =0;
				}
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {

		String s = "1+2";
		System.out.println(maxDepth(s));

	}

}
