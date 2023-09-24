package challenges;

public class IsSubSequence {
	public boolean isSubsequence(String s, String t) {
        char[] charArrayS=s.toCharArray();
        char[] charArrayT=t.toCharArray();
        StringBuffer tempString =new StringBuffer();
        int j=0;
        if(s.length()==0) return true;
        if(s.length()>t.length()) return false;
        for(int i=0 ;i<s.length();i++){
            while(j<t.length() ){
                if(charArrayS[i]==charArrayT[j]){
                    tempString.append(charArrayS[i]);
                    j++;
                    if(tempString.toString().equals(s)) return true;
                    break;
                }
                j++;
            }
            
        } 
        return false; 
    }

	public static void main(String[] args) {
		String s = "axc";
		String t = "ahbgdc";

		System.out.println(isSubSequence(s, t));
	}

}
