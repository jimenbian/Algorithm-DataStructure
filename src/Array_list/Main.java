package Array_list;

public class Main {
   public static void main(String args[]){
	   myArrayList ls=new myArrayList();   	  
	   ls.addFirstNode(15);	   
	   ls.addFirstNode(16);
	   ls.add(1, 144);
	   ls.add(2, 44);
	   ls.deleteByPos(1);
	  ls.displayAllNodes();	   
   }
}
