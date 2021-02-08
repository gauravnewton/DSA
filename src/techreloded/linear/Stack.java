package techreloded.linear;

public class Stack {
    /*
        A stack is a useful data structure in programming.
        It is just like a pile of plates kept on top of each other.

        Think about the things you can do with such a pile of plates

        * Put a new plate on top
        * Remove the top plate

        If you want the plate at the bottom, you must first remove all the plates on top.
        Such an arrangement is called Last In First Out - the last item that is the first item to go out.


        Basic Operations of Stack

        A stack is an object (an abstract data type - ADT) that allows the following operations:

        * Push: Add an element to the top of a stack
        * Pop: Remove an element from the top of a stack
        * IsEmpty: Check if the stack is empty
        * IsFull: Check if the stack is full
        * Peek: Get the value of the top element without removing it

     */

      private int top;
      private int capacity;
      private int[] stack;

      public Stack(int capacity){
          top = -1;
          this.capacity = capacity;
          stack = new int[capacity];
      }

      public boolean isEmpty(){
          if( top == -1 )
              return true;
          return false;
      }

      public boolean isFull(){
          if( top == capacity -1 )
              return true;
          return false;
      }

      public void push(int item){
          if( isFull() )
              System.out.println("Stack is full");
          else {
              top++;
              stack[top] = item;
          }
      }

      public int pop(){
          if( isEmpty() ) {
              System.out.println("Stack is empty");
              return -1;
          }
          else{
              return stack[top--];
          }
      }

      public void peek(){
          if( isEmpty() ) {
              System.out.println("Stack is empty");
          }
          else{
              System.out.println(stack[top]);
          }
      }

      public void size(){
          System.out.println("Size :"+ (top+1));
      }

      public void print(){
          System.out.println("Stack's content");
          for( int i = top; i >= 0; i--){
              System.out.println(stack[i]);
          }
      }



}
