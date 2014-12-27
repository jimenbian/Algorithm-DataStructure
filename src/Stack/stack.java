package Stack;

public class stack {
    String[] theArray=new String[100];
    int topOfStack=0;
	public void add(String x){
		theArray[topOfStack]=x;
		topOfStack+=1;		
	}
	
	public String pop(){
		
		topOfStack-=1;
		return theArray[topOfStack];	
	}
}
