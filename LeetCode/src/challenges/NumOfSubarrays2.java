package challenges;

public class NumOfSubarrays2 {
	public static int numOfSubarrays(int[] arr) {
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (i == j) {
					sum = arr[i];
					if (sum % 2 == 1) {
						System.out.println(sum);
						count++;
						sum = 0;
					}	
				}
				if(j==i+1) {
					sum=arr[i]+arr[j];
				} else if(j>i+1) {
					sum=sum+arr[j];
				}
				
				if(sum%2==1) {
					count++;
				}
			}
			sum=0;
		}

		return (int)(count%1000000007);

	}

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7};
		System.out.println(numOfSubarrays(arr));

	}

}
