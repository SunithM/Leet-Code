package challenges;

public class MethodDemo {

	static void myMethod(String s) {
		System.out.println(s);
	}

	static void diff(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	static int diffr(int a, int b) {
		int res = a - b;
		return res;
	}
	static String display(String s) {
		return s;
	}
	public static void main(String[] args) {
//		myMethod("Sunith");
//		myMethod("Shobhna");
//		myMethod("Name");
//		diff(20, 5);
//		int s=diffr(20,10);
//		System.out.println(s);
		String s=display("Shobhna");
		System.out.println(s);
	}

}
