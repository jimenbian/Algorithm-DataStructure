package Introduction;

public class Recursion {
     public static void main(String args[]){
   
    	  System.out.print(f(2));
  	 }
	   public static double f(int x){
		   if (x==0){
			   return 0;
		   }
		   else{
			   return f(x-1)+x/Math.pow(4,x);
		   }
	   }
}
