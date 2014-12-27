package Array_list;

public class myArrayList {
      public Node first;//定义头结点
      private int pos=0;//节点位置
      public myArrayList(){
    	  // this.first=null;
      }
      //插入一个头结点
      public void addFirstNode(int data){
    	    Node node=new Node(data);
    	    node.next=first;
    	    first=node;
      }
      //删除头结点
      public Node deleteFirstNode(){
    	    Node tempNode=first;
    	    first=tempNode.next;
    	    return tempNode;
      }
      // 在任意位置插入节点 在index的后面插入  
      public void add(int index, int data) {  
           Node node = new Node(data);  
           Node current = first;  
           Node previous = first;  
            while ( pos != index) {  
               previous = current;  
               current = current. next;  
                pos++;  
           }  
           node. next = current;  
           previous. next = node;  
            pos = 0;  
      }  
      // 删除任意位置的节点  
      public Node deleteByPos( int index) {  
           Node current = first;  
           Node previous = first;  
            while ( pos != index) {  
                pos++;  
               previous = current;  
               current = current. next;  
           }  
            if(current == first) {  
                first = first. next;  
           } else {  
                pos = 0;  
               previous. next = current. next;  
           }  
            return current;  
      }     
      public void displayAllNodes() {  
          Node current = first;  
           while (current != null) {  
              current.display();
              System.out.println();
              current = current. next;  
          }            
     }  
      
}

