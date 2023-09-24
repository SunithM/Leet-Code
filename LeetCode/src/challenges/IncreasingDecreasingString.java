package challenges;

public class IncreasingDecreasingString {
	public static String sortString(String s) {
		  StringBuilder temp = new StringBuilder(s);
	        StringBuilder sb = new StringBuilder();
	        
	        while(temp.length() != 0){
	            for(char c='a';c<='z';c++){
	                int index = temp.indexOf(c+"");
	                if(index != -1){
	                    sb.append(c);
	                    temp.deleteCharAt(index);
	                }
	               
	            }
	            for(char c='z';c>='a';c--){
	                int index = temp.indexOf(c+"");
	                if(index != -1){
	                    sb.append(c);
	                    temp.deleteCharAt(index);
	                }               
	            }
	        }
	        
	        return sb.toString();
	    
	}
	public static void main(String[] args) {
		String s="aabcbz";
		System.out.println(sortString(s));

	}

}
