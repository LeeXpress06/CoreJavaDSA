package Stack;

public class Stack {
      int [ ] arr;
      int top;
      public Stack( int size){
          arr = new int[size];
          top = -1;  // initially it is empty but will increase the value of top
      }

// method to check if it is empty

   public boolean isEmpty( ){

          if(top == -1) return true;
          else return false;

   }

      // push method implementation
    public void push( int value){

          if( top >= arr.length) System.out.println("The stack is full");
          arr[top++] = value;
    }





}
