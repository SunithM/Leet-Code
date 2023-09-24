package challenges;

public class IsUniqueCh {
	public static boolean isUnique(String str) {
		if(str.length()>128) return false;
		boolean [] ch_set=new boolean[128];
		
		for(int i=0;i<str.length();i++) {
			int val=str.charAt(i);
			if(ch_set[val]) {
				return false;
			}
			ch_set[val]=true;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd@";
		System.out.println(IsUniqueCh.isUnique(str));
	}

}
