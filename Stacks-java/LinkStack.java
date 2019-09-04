// Alexander Gonzales
// CS 272 - Data Structures
// 3/11/2019
// Lab 7
// LinkStack.java
// purpose: Implement and Test a Generic Stack Interface with linked nodes


/**
* A stack made up of a linked list using nodes of generic data types.
*/
public class Stack<E> {
   /**
   * The first node in the stack, containing a generic data type
   */
   private SNode<E> stacknode;
   
   /**
   * The quantity of elements in the stack
   */
   private int p;
   
   /**
   * Default constructor; sets an empty node as the head of the stack, quantity of elements to zero
   */
   public Stack() {
      stacknode = new SNode();
      p = 0;
   }// end default constructor
   
   /**
   * Simple constructor, starts a stack with a given value, and sets the quantity of elements to 1
   */
   public Stack(E e) {
      stacknode = new SNode(e);
      p = 1;
   }// end simple constructor
   
   /**
   * Method to push element onto the stack
   * @param e
   *     Data (of any type) to push onto the stack
   */
   public void push(E e) {
      if(p == 0) {             // base case, list is empty 
         stacknode.setData(e); // first node contains pushed data 
         p++;                  // increase size
         return;               // otherwise..
      }// end if
      SNode<E> cursor = stacknode;    // start cursor at first node 
      SNode<E> newnode = new SNode(e, null); // create new node to add at the end of the stack
      while(cursor.getLink() != null) { cursor = cursor.getLink(); } // move cursor to end of stack
      cursor.setLink(newnode);        // connect the end node to the new pushed node
      p++;                    // increase size
   }// end push
   
   /**
   * Method to Find the most recently pushed element
   * @return 
   *     The highest element on the stack
   */
   public E top() {
      SNode<E> cursor = stacknode;   // start cursor on the first element of stack
      while(cursor.getLink() != null) cursor = cursor.getLink(); // move the cursor to the end of the stack
      return cursor.getData();       // return the last node's data
   }// end top
   
   /**
   * Method to pop the most recently pushed element from the stack
   * @return
   *     The highest element on the stack (which was also just popped from the stack)
   */
   public E pop() {
      if(isEmpty()) {   // base case, stack is empty
         System.out.println("Link is empty.");
         return null;
      }// end if          Otherwise...
      E x;                // the data which will be removed
      SNode<E> extraNode = new SNode(0, stacknode);   //create a new node before the head to avoid Null error
      SNode<E> cursor = extraNode;                    // start cursor at this pre-node
      while(cursor.getLink().getLink() != null) cursor = cursor.getLink(); // move cursor to ALMOST the end of the list
      x = cursor.getLink().getData();                 // record the data
      cursor.setLink(null);                           // disconnect the last node from the list
      p--;                                            // decrement the size of list
      return x;                                       // return popped data
   }// end pop
   
   
   /**
   * Method to return size of stack
   * @return p
   *     The quanity of elements on the stack
   */
   public int size() {
      return p;
   }// end size
   
   /**
   * Method to return whether or not the list is empty
   * @return
   *     true if empty, false if not empty
   */
   public boolean isEmpty() {
      if(p > 0) return false;
      return true;
   } // end isEmpty
   
   /**
   * Method to return string of elements on the stack
   * @return s
   *     The string of elements, eg:   "a, g, 8, flefth, (, ), 333"
   */
   public String toString() {
      String s = "";
      SNode cursor = stacknode;
      while(cursor != null) {
         s += cursor.getData();
         if( cursor.getLink() != null) s += ", ";
         cursor = cursor.getLink();
      }// end while
      return s;
   }// end toString
   
   
   
   // MAIN
   public static void main(String[] args) {
     LinkStack stack1 = new LinkStack();
     System.out.println("Stack1 empty? " + stack1.isEmpty());
     stack1.pop();
     System.out.println("Stack1 size: " + stack1.size());
     System.out.println(stack1);
     stack1.push(0);
     System.out.println(stack1);
     stack1.push(1);
     System.out.println(stack1);
     stack1.push(2);
     System.out.println(stack1);
     stack1.push(3);
     System.out.println(stack1);
     System.out.println("Stack1 size: " + stack1.size());
     System.out.println("Stack1 empty? " + stack1.isEmpty());
     stack1.pop();
     System.out.println(stack1);
     stack1.pop();
     System.out.println(stack1);
     System.out.println("Stack1 size: " +stack1.size());
     stack1.push(4);
     System.out.println(stack1);
     stack1.push(5);
     System.out.println(stack1);
     stack1.push(6);
     System.out.println(stack1);
     System.out.println("Top: " +stack1.top());
     System.out.println("Size: " +stack1.size());
     System.out.println("Pop: " +stack1.pop());
     System.out.println(stack1);
     System.out.println("Size: " +stack1.size()); 
     stack1.push(7);
     stack1.push(8);
     stack1.push(9);
     stack1.push(10);
     stack1.push(11);
     stack1.push(12);
     stack1.push(13);
     System.out.println(stack1);
     System.out.println("Size: " +stack1.size());
     
     System.out.println();
     
     LinkStack stack2 = new LinkStack("First");
     System.out.println("Stack2 empty? " + stack2.isEmpty());
     stack2.pop();
     System.out.println("Stack2 size: " + stack2.size());
     System.out.println(stack2);
     stack2.push('a');
     System.out.println(stack2);
     stack2.push('b');
     System.out.println(stack2);
     stack2.push("ahb");
     System.out.println(stack2);
     stack2.push('7');
     System.out.println(stack2);
     System.out.println("Stack2 size: " + stack2.size());
     System.out.println("Stack2 empty? " + stack2.isEmpty());
     stack2.pop();
     System.out.println(stack2);
     stack2.pop();
     System.out.println(stack2);
     System.out.println("Stack2 size: " +stack2.size());
     stack2.push('%');
     System.out.println(stack2);
     stack2.push('>');
     System.out.println(stack2);
     stack2.push(8);
     System.out.println(stack2);
     System.out.println("Top: " +stack2.top());
     System.out.println("Size: " +stack2.size());
     System.out.println("Pop: " +stack2.pop());
     System.out.println(stack2);
     System.out.println("Size: " +stack2.size()); 
     stack2.push('X');
     stack2.push('Y');
     stack2.push('Z');
     stack2.push("ABC");
     stack2.push("DEF");
     stack2.push("HIJ");
     stack2.push("DONE");
     System.out.println(stack2);
     System.out.println("Size: " +stack2.size());
   }// end main
}// end LinkStack