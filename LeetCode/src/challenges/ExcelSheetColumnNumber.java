package challenges;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("AAB"));
	}

	public static int titleToNumber(String columnTitle) {
		
		char [] columntitleChArray=columnTitle.toCharArray();
		int titleNumber=0;
		int len=columntitleChArray.length;
		for(int i=0;i<len;i++) {
			int val=columntitleChArray[i]-64;
			titleNumber=(int) (titleNumber+(val*Math.pow(26, len-i-1)));
		}
		return titleNumber;
		
	}

}
