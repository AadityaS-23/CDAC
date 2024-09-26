package ADS;
import java.util.Scanner;

class SinglyList{
    //Node is static member class of SinglyList
    static class Node{ // why static : to access its members outside the class (if not used,we had to implement get/set)
       // Node class fields
       private int data; // to hold the value
        private Node next; // to point to the next node

        public Node() {
            data = 0;
            next = null; // initialize next as null
        }
        public Node(int val){
            data = val ;
            next = null ;
        }
    }
     
    private Node head;
    

      //list class methods
       public  SinglyList(){             //ret type error: void added
        head = null ;
       }
       
   // --------------------------------------------------    
       void display(){
        System.out.println("List : ");   
        Node trav = head;
        while (trav != null){
           System.out.println(trav.data);
           trav=trav.next;
         }
       System.out.println(" ");   
     }
      
  // -----------------------------------------------------
     
       void addFirst(int val){
        //allocate node and ini it
        Node newNode = new Node(val);
       // new node next shld point to head
        newNode.next=head;
       // head should point to new node
        head=newNode;
     }
      
     // -----------------------------------------------------  
     
     void addLast(int val){
          // Create new Node & initialize it
          Node newNode = new Node(val);
          // Special case  : If list is empty,make new node as first node of list
          if(head == null ){
            head =newNode;
          }
          // general case : add node at the end 
          else {
            //traverse till last node
          Node trav = head ;
          while(trav.next != null)
              trav= trav.next;
          // add new node after trav(trav.next)
           trav.next = newNode;    
         }
    }   
     
    // --------------------------------------------------------
    
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
            if(trav.next == null )
            break;
            trav=trav.next;
         } 
         //new node's next should point to trav's next
         newNode.next = trav.next;
        // trav's next shlould point to new node
          trav.next = newNode;  
    
        }   
    }
  
  // ---------------------------------------------------------
  
    public void delFirst(){
    //special case 1 : if list is empty,throw exception
    if(head == null)
      throw new RuntimeException("List is Empty! ");
    //general case : make head pointing to the next node.
    head = head.next;
    //NOTE : The old first node will be garbage collected
  }
public void delAll() {
    head = null;
    //all nodes will be garbage collected
    
 }
 
 // -------------------------------------------------
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
    //special case 3 : if pos > length of list,then throw exception
    if(trav == null)
       throw new RuntimeException("Invalid Position.");
       temp = trav;
       trav = trav.next;  
  }
  // trav is node to be deleted & temp is node before that
  temp.next= trav.next;
  //trav node will be garbage collected
  }

  //----------------------------------------------------

  public void delLast() {
    //special case 1 : If list is empty,throw exception
 if(head == null ){
    throw new RuntimeException("List is empty");
 }  
   // special case 2 : if there is only one mode
 if( head.next == null){
    head = null ;
    return;
}
   // General case 1 : traverse to the second last node
    Node trav = head;
    while (trav.next.next != null ){
    trav = trav.next;
}
    // General Case 2  : trav is last node
     trav.next = null ; // removes the last node
 }
}
// ----------------------------------------------------------

public class SinglyListMain {
 public static void main(String[] args) {
    int choice,val;
    SinglyList list = new SinglyList();
    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("\n\n0. Exit\n1. Display\n2. Add First\n3. Add Last\n4. Add at POS\n5. Del First\n6. Del Last\n7. Del at POS\n8. Del ALL");
        choice = sc.nextInt();
        int pos;
        switch(choice){
            case 1: // Display
            list.display();
              break; 
            case 2: // Add First
            System.out.println("Enter new Element : ");
            val=sc.nextInt();
            list.addFirst(val);
               break;  
            case 3: // Add Last
            System.out.println("Enter new Element : ");
            val = sc.nextInt();
            list.addLast(val);
                break;
            case 4: // Add at POS
            System.out.println("Enter new Element : ");
            val=sc.nextInt();
            System.out.println("Enter Position : ");
            pos=sc.nextInt();
            list.addAtPos(val,pos);
                break;   
            case 5: // Del First
            try {
                list.delFirst();
                System.out.println("First element deleted.");
            }catch (Exception e){
                   System.out.println(e.getMessage());
            }break;  
            case 6: // Del Last
           try{
            list.delLast();
            System.out.println("Last element deleted.");
           } catch (Exception e){
              System.out.println(e.getMessage());
           }   
            break; 
            case 7: // Del at POS
               System.out.println("Enter element position : ");
               pos = sc.nextInt();
               list.delAtPos(pos);
               break;  
            case 8: // Del ALL
            list.delAll();
                break; 

        }
    
    }while(choice != 0);
   sc.close();
  }

}
