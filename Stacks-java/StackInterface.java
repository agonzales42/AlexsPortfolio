// Alexander Gonzales
// CS 272 - Data Structures
// 3/11/2019
// Lab 7
// StackInterface.java
// purpose: Define an interface of methods that a stack structure with generic data should be able to utilize


public interface StackInterface<E> {
   public void push(E e);    // Add element to stack
   public E pop();           // Remove element from stack
   public E top();           // Find highest element of stack
   public int size();        // Find quantity of elements in the stack
   public boolean isEmpty(); // Determine whether or not the stack is empty
}// End StackInterFace