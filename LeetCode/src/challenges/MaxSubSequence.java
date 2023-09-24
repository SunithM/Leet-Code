package challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxSubSequence {

	public static int[] maxSubSequence(int[] array,int k) {
		int maxSubSequense[] = new int[k] ;
		
		int l=array.length;
		int index=0;
		Arrays.sort(array);
		for(int i=l-1;i>=l-k;i--) {
			maxSubSequense[index]=array[i];
			System.out.println(array[i]);
			index++;
		}
		
		return maxSubSequense;
	}
	
	public static int[] sort(int[] input) {
		int l=input.length;
		Map<Integer,Integer> myMap=new HashMap<>();
		int sortedArray[] =new int[l];
		
		for(int i =0;i<l-1;i++) {
			for(int j=0;j<l-i-1;j++) {
				if(input[j] <input[j+1]) {
					int temp=input[j];
					myMap.put(i, temp);
					input[j]=input[j+1];
					input[j+1]=temp;
					
				}
			}
		}
		System.out.println(myMap);
		return input;
	}
	
	public static void main(String[] args) {
		int nums[] = {2,1,3,3,89,6};
		int k = 2;
		
		System.out.println(Arrays.toString(MaxSubSequence.sort(nums)));
	}

}
