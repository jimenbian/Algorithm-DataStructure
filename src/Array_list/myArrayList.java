package Array_list;

public class myArrayList {
      public Node first;//����ͷ���
      private int pos=0;//�ڵ�λ��
      public myArrayList(){
    	  // this.first=null;
      }
      //����һ��ͷ���
      public void addFirstNode(int data){
    	    Node node=new Node(data);
    	    node.next=first;
    	    first=node;
      }
      //ɾ��ͷ���
      public Node deleteFirstNode(){
    	    Node tempNode=first;
    	    first=tempNode.next;
    	    return tempNode;
      }
      // ������λ�ò���ڵ� ��index�ĺ������  
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
      // ɾ������λ�õĽڵ�  
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

