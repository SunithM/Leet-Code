package challenges;

import java.util.Stack;

public class DecodeString {

	public static String decodeString(String s) {
		Stack<String> stack = new Stack<>();

		for (String ch : s.split("")) {
			if (!"]".equals(ch)) {
				stack.push(ch);

			} else {
				String str = "";
				String top = stack.pop();
				while (!"[".equals(top)) {
					str = top + str;
					top = stack.pop();

				}
				String k = stack.pop();
				String peek = stack.isEmpty() ? null : stack.peek();
				while (peek != null && "0".compareTo(peek) <= 0 && "9".compareTo(peek) >= 0) {
					k = stack.pop()+k;
					peek = stack.isEmpty() ? null : stack.peek();

				}
				int kval = Integer.parseInt(k);
				String merged = "";
				while (kval-- > 0) {
					merged += str;
				}
				stack.push(merged);
			}
		}
		String result = "";
		while (!stack.empty()) {
			result = stack.pop() + result;
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		System.out.println(decodeString(s));
	}

}
