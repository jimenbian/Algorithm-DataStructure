package Algorithm_analysis;

public class MaxSumOfArray {
     
	
	 public static void main(String args[]){
		   
   	  System.out.print(max_sum());
 	 }
	   public static int max_sum(){
		  int[] array={-2,11,-4,13,-5,-2}; 
		  int max_sum=0;
		  int array_sum=0;
		  for(int j=0;j<array.length;j++)
		  {
            array_sum+=array[j];
            if(array_sum<0){
            	  max_sum=0;
            }
            if (array_sum>max_sum)
            {
            	max_sum=array_sum;
            }
	      }
		  return max_sum;

}
	  }
