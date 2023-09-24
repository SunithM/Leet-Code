package challenges;

public class LongestCommanPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution12 obj=new Solution12();
		String[] str= {"aaa","aa","aaaa","aacs"};
		System.out.println(obj.longestCommanPrefix(str));

	}

}

class Solution12
{
	public String longestCommanPrefix(String[] str)
	{
		String prefix,st;
		int k=0;
		int len=str.length;
		if(len==0)
		{
			return "";
		}
		if(len==1)
		{
			return str[0];
		}
		
		prefix=str[0];
		for(int i=1;i<len;i++)
		{	
			st=str[i];
			k=0;
			while(k<prefix.length() &&
					k<st.length() &&
					prefix.charAt(k)==st.charAt(k))
			{
				k++;
			}
			
		}
		return prefix.substring(0, k);
	}
}
