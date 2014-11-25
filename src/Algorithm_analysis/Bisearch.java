package Algorithm_analysis;

public class Bisearch {

	static int[] array={-3,-2,0,4,5,7,12,64}; 
	public static void main(String args[]){
	   int left=0;
	   int right=array.length;
	   int center=0;
	   int k=7;
	  
	   while(left<=right){
		  center=(right+left)/2;
		   if ((array[center]-k)==0){
			  System.out.print(center);
			  break;
		   }
		   else{
            if((array[center]-k)>0){
                 right=center;
            }
                 else{
                	 left=center;
                 }
                	 }
                 }
	   }
}
	
	
	

