// Alexander Gonzales
// CS 272 - Data Structures
// 3/11/2019
// Lab 7
// ArrayListStack.java
// purpose: Implement and Test a Generic Stack Interface with ArrayList


import java.util.ArrayList;

/**
* A stack structured with an ArrayList
*/
public class ArrayListStack<E> implements StackInterface<E> {

   /**
   * An ArrayList of generic data type to contain the data
   */
   private ArrayList<E> data;
   
   /**
   * The quantity of elements on the stack
   */ 
   private int p;
   
   
   
   /**
   * Default constructor that sets initial capacity to 10 and quantity of elements to zero
   */
   public ArrayListStack() {
      data = new ArrayList<E>();
      p = 0;
   }// end default constructor
   
   
   
   /**
   * Constructor that sets initial capacity to a given integer, and quantity of elements to zero
   */
   public ArrayListStack(int initialCapacity) {
      data = new ArrayList<E>(initialCapacity);
      p = 0;
   }// end given capacity constructor
   
   
   
   /**
   * Method to add element of generic type to the stack
   * @param e
   *     The datum to add to the stack
   */
   public void push(E e) {
      ensureCapacity();   // call ensureCapacity method before element is added
      data.add(e);        // add datum to stack
      p++;                // increment quantity of elements
   }// end push
   
   
   
   /**
   * Method which returns the datum most recently added to the stack
   * @return
   *     Datum of generic data type that was most recently added to the stack
   */
   public E top() {
      if(isEmpty()) {   // base case, stack is empty
         System.out.println("List is empty");
         return null;
      }// end if        otherwise...
      return data.get(p-1); // return most recent data on the stack (element at index size-1)
   }// end top
   
   
   
   /**
   * Method which pops the most recently added datum from the stack (and returns its value)
   * @return
   *     The value of the datum that was just popped off the stack
   */
   public E pop() {
      if(isEmpty()) { // base case, list is empty
        System.out.println("List is empty.");
        return null;
      }// end if      otherwise...
      E val = data.get(p-1);  // record the value of the last element in array list
      data.remove(p-1);       // remove the last value
      p--;                    // decrement quantity of elements in stack
      return val;             // return popped value
   }// end pop
   
   
   
   /**
   * Method that returns quantity of elements in stack
   * @return p
   *     Quantity of elements in stack
   */
   public int size() {
      return p;
   }// end size
   
   
   
   /**
   * Method that returns whether the list is empty or not
   * @return
   *     boolean type: true if empty, false if not empty
   */
   public boolean isEmpty() {
      if (p > 0) return false;  // test the size of array
      return true;
   }// end isEmpty
   
   
   
   /**
   * Method to increase capacity of array when capacity has been reached
   */
   private void ensureCapacity() {
      if(p+1 == data.size()) {    // when the array reaches max capacity..
         ArrayList<E> temp = new ArrayList<E>(p*2);
         for(int i = 0; i < p; i++) temp.set(i, data.get(i)); // manually copy array list to temp array using for loop
         data = temp;                                         // assign original array to temp array using pointer
      }// end if
   }// end ensureCapacity
 
 
   /**
   * Method to create string from data in stack
   * @return s
   *     A string of the elements in the stack (in order), separated by commas
   */
   public String toString() {
      String s = "";    // create string
      for(int i = 0; i < p; i++) {
         s += data.get(i);       // add datum to string
         if(i != p-1) s += ", "; // unless datum is last element, add ", "
      }// end for
      return s;
   }// end toString
   

   public static void main(String[] args) {
      ArrayListStack stack1 = new ArrayListStack();
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
      
      System.out.println("\n\n");
      ArrayListStack stack2 = new ArrayListStack(4);
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
   
}// end ArraylistStack