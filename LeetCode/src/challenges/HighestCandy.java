package challenges;

import java.util.ArrayList;
import java.util.List;


public class HighestCandy {
	private static int maxValue(int[] val) {
	    int max = 0;
	    for (int ktr = 0; ktr < val.length; ktr++) {
	        if (val[ktr] > max) {
	            max = val[ktr];
	        }
	    }
	    return max;
	}
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        List<Boolean> g=new ArrayList<>();
	        int tempMax=0;
	        for(int i=0;i<candies.length;i++) {
	        	int temp=candies[i];
	        	candies[i]+=extraCandies;
	        	if(maxValue(candies) <= candies[i]) {
	        		g.add(true);
	        	} else {
	        		g.add(false);
	        	}
	        	candies[i]=temp;
	        }
	        
	        return g;
	    }
	public static void main(String[] args) {
		int candies[]= {4,2,1,1,2};
		int extra=1;
		System.out.println(kidsWithCandies(candies, extra));

	}

}
