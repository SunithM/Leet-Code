package challenges;

public class MaxProfit {
	
//	public int maxProfit(int[] prices) {
//        
//		return 1;
//    }

	public static void main(String[] args) {
		
		int[] prices= {7,6,4,3,1,88,90};
		int max=0;
//		for(int i=0;i<prices.length;i++)
//		{
//			for(int j=i+1;j<prices.length;j++) {
//				int profit=prices[j]-prices[i];
//				if(prices[i]<prices[j] && profit>max) {
//					max=profit;
//				}
//			}
//		}
		 int min = Integer.MAX_VALUE;
	        for(int i = 1; i < prices.length; i++){
	            if(prices[i] > prices[i-1])
	                min = Math.min(min, prices[i-1]);
	            max = Math.max(max, prices[i] - min);
	        }
		
System.out.println("Maximum profit is: "+max);
	}

}
