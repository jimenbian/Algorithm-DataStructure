package Algorithm_analysis;

public class Euclid {

	public static void main(String[] args){
		int m=63;
		int n=18;
		int remainder=0;
		while(n!=0){
		  remainder=m%n;
		  m=n;
		  n=remainder;		  
		}
		System.out.print(m);
	}
}
