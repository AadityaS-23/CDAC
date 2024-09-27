package ADS;

import java.util.Scanner;

class SinglyCircularList {
	// Node Class
	static class Node {
		// Node class fields
		private int data;
		private Node next;

		// Node Class methods
		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
		  data = val;
			next = null;
		}

	}

	// List class Fields
	private Node head;

	// List class methods
	public  SinglyCircularList() {
    	head = null ;
    }

    public boolean isEmpty(){
        return head == null ; // T > list is empty , F > list is not empty 
        // advantage  of using boolean here is that it can be used in if condition directly
    }
   
   // ----------------------------------------------

    public void display() {
        System.out.println("List : ");
       //special case : if list is empty,then return(we can throw exception also)
        if(isEmpty())
        return ;
        // general case : print all nodes from the list
    	Node trav = head ;
    do {
    	System.out.println(trav.data);
        trav = trav.next;
        } while(trav != head);	
    }
    
    // -----------------------------------------------

    public void addLast(int val){
        // create new node and init it
        Node newNode = new Node(val);
        //Special case  1 : if list is empty,newNode is 1st node and make it circular
        if(isEmpty()){
            head = newNode;
            newNode.next = head ;
        }
        else{  // general case : add node at the end
        // travese till last node (trav) ie whose next contains head
        Node trav = head ;
        while(trav.next != head)
           trav=trav.next;
        //new nodes head point to head
        newNode.next = head;
        // last node's (trav ) next to new node
        trav.next = newNode ;
        }
    }
    
    public void addFirst(int val){
        // create new node and init it
        Node newNode = new Node(val);
        //Special case  1 : if list is empty,newNode is 1st node and make it circular
        if(isEmpty()){
            head = newNode;
            newNode.next = head ;
        }
        else{  // general case : add node at the end
        // travese till last node (trav) ie whose next contains head
        Node trav = head ;
        while(trav.next != head)
           trav=trav.next;
        //new nodes head point to head
        newNode.next = head;
        // last node's (trav ) next to new node
        trav.next = newNode ;
        // head points to new node
        head = newNode;   //pnly 1 line extra [addLast & addFirst]
      }
    }
    public void addAtPos(int val,int pos){ // we have to put val at pos
        //special case 1 : if list is empty,add node at the start
        //special case 2 : if pos <= 1,add node at the start
        // instead of re writing the code,we call the ready made function
        if(head == null || pos<=1)
        addFirst(val);
        else{
        //allocate & initialize new node
         Node newNode = new Node(val);
         // traverse till position - 1 (trav)
         Node trav = head ;
         
         for(int i=1;i<pos-1;i++){
            //special case 3 : if pos > length of list,add node at the end
            if(trav.next == head ) // null replaced with head
            break;
            trav=trav.next;
         } 
         //new node's next should point to trav's next
         newNode.next = trav.next;
        // trav's next shlould point to new node
          trav.next = newNode;  
    
        }   
    }
        public void delFirst(){
            // special case 1: if list is empty ,throw exception
            if(isEmpty())
              throw new RuntimeException("List is Empty!");
            // special case 2 : if list has only 1 node, make the head = null;
              if(head.next == head)
               head = null ;
            // general case : delete first node
            else{  
            // traverse till last node (trav)
            Node trav = head;
            while(trav.next != head)
            trav=trav.next;
            // take head to next node(2nd)
            head=head.next;
            // the last node (trav) next should be to new head 
            trav.next=head;
        }
    }
        public void delLast(){
            //special case 1 : If list is empty,throw exception
            if(head == null ){
            throw new RuntimeException("List is empty");
            }  
            // special case 2 : if there is only one node
            if( head.next == null){
            head = null ;
    
            }else{
            // General case 1 : Delete last node
            Node temp = null,trav=head;
            // traverse till last node (trav) and run temp behind it
            while (trav.next != head ){
            temp=trav ;
            head=trav.next;
             }
            // General Case 2  : trav is last node
            trav.next = head ; // removes the last node(garbage collected)
  
            } 
         }
   
         public void delAtPos(int pos){
            // special case 1 : if pos = 1 ,delete first node
            if(pos==1)
              delFirst();
            // special case 2 : if list is empty or pos < 1,then throw exception
            if(head == null || pos < 1)
              throw new RuntimeException("List is Empty or Invalid Position");
            //take temp pointer running behind tray
            Node temp = null,trav = head;
            // traverse till pos(trav)
            for(int i = 1;i<pos;i++){
                if(trav.next == head)
                //special case 3 : if pos > length of list,then throw exception
                throw new RuntimeException("Invalid Position.");
                 temp = trav;
                 trav = trav.next;  
                           
                }
            // trav is node to be deleted & temp is node before that
            temp.next= trav.next;
            //trav node will be garbage collected
            }

        public void delAll(){
            head = null;
        }
}

	public class SinglyCircularListMain {
		public static void main(String[] args) {
			int choice, val;
			SinglyCircularList list = new SinglyCircularList();
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println(
						"\n\n0. Exit\n1. Display\n2. Add First\n3. Add Last\n4. Add at POS\n5. Del First\n6. Del Last\n7. Del at POS\n8. Del ALL");
				choice = sc.nextInt();
				int pos;
				switch (choice) {
				case 1: // Display
					 list.display();
					break;
				case 2: // Add First
					System.out.println("Enter new Element : ");
					 val = sc.nextInt();
					 list.addFirst(val);
					break;
				case 3: // Add Last
					 System.out.println("Enter new Element : ");
					 val = sc.nextInt();
					 list.addLast(val);
					break;
				case 4: // Add at POS
					 System.out.println("Enter new Element : ");
				     val = sc.nextInt();
					 System.out.println("Enter Position : ");
					 pos = sc.nextInt();
					 list.addAtPos(val, pos);
                     System.out.println("Element at " +pos+ " is added successfully! ");
					break;
				case 5: // Del First
					 try {
					 list.delFirst();
					 System.out.println("First element deleted.");
					 } catch (Exception e) {
					 System.out.println(e.getMessage());
					 }
					break;
				case 6: // Del Last
					 try {
					 list.delLast();
					 System.out.println("Last element deleted.");
					 } catch (Exception e) {
					 System.out.println(e.getMessage());
					 }
					break;
				case 7: // Del at POS
                    try { System.out.println("Enter element position : ");
                    pos = sc.nextInt();
                    list.delAtPos(pos);
                    System.out.println("Element at " +pos + " deleted successfully!"); 
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
				    break;
				case 8: // Del ALL
					list.delAll();
                    System.out.println("All elements deleted Successfully!!");
					break;

				}

			} while (choice != 0);
			sc.close();
		}

}