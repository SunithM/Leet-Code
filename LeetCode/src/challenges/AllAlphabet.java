package challenges;

public class AllAlphabet {
	
	static boolean  checkIfPangram(String sentence) {
	     boolean res=true;
	     int index=0;
	     boolean[] all = new boolean[26];
	     
	     if(sentence.length()<26) {
	    	 res=false;
	     }
	     for(int id=0;id< sentence.length();id++) {
	    	 if('a' <=sentence.charAt(id)&& sentence.charAt(id)<='z') {
	    		 index=sentence.charAt(id)-'a';
	    	 }
	    	 all[index]=true;
	     }
	     
	     for(int id=0;id<26;id++) {
	    	 if(!all[id])
	    		 return false;
	     }
			
			return res;
	    }

	public static void main(String[] args) {
		String sentence="farmer jack realized that big yellow quilts were expensive";
		//sentence="hello";
		System.out.println(AllAlphabet.checkIfPangram(sentence));

	}

}
