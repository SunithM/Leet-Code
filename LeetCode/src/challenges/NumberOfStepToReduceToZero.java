package challenges;

public class NumberOfStepToReduceToZero {
public static int numberOfSteps (int num) {
      int steps=0; 
      while(num>0) {
    	  if(num%2==0) {
    		  num=num/2;
    		  steps++;
  }
    	  else {
    		  num=num-1;
    		  steps++;
    	  }
    	  
      }
      
      
      
      return steps;
    
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		System.out.println(NumberOfStepToReduceToZero.numberOfSteps(num));

	}

}
