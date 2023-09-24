package challenges;

public class GoalParser {

public static String interpret(String command) {
        StringBuilder sb=new StringBuilder(); 
        // "G()(al)"
        char[] ch=command.toCharArray();
        for(int i=0;i<command.length();i++) {
        	if(ch[i]=='G') {
        	System.out.println(ch[i]);
        	sb.append(ch[i]);
        	}
        	if(ch[i]=='(') {
        		if(ch[i+1]=='a') {
        			if(ch[i+2]=='l') {
        				if(ch[i+3]==')') {
        					sb.append("al");
        				}
        			}
        		}
        	}
        	if(ch[i]=='(') {
        		if(ch[i+1]==')') {
        			sb.append("o");
        		}
        	}
        }
        
        return sb.toString();
    }
	public static void main(String[] args) {
		String test="G()(al)ww";
		System.out.println(interpret(test));
	}

}
