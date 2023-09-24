package com.suni.interview;

public class KandesAlgorithmMaxSubarraySum {

	public static int maxSubArraySum(int a[]) {
		int curSum=0;
		int maxSum=Integer.MIN_VALUE;
		int begInd=0;
		int endInd=0;
		for(int i=0;i<a.length;i++) {
			curSum=curSum+a[i];
			if(curSum>=maxSum) {
				endInd=i;
				maxSum=curSum;			
			}
			if(curSum<0) {
				begInd=i+1;
				curSum=0;
			}
		}
		System.out.println("Begin index: "+begInd);
		System.out.println("End index: "+endInd);
		for(int i=begInd;i<=endInd;i++) {
			System.out.print(a[i] +"\t");
		}
		System.out.println();
		return maxSum;
	}
	public static void main(String[] args) {
		int a[]= {-2,-1};
		System.out.println(maxSubArraySum(a));

	}

}
