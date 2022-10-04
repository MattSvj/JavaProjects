import java.util.*;

public class stackUsingArray{

   private int[] myStack;
   private int pointer;

   /**
    -Constructor
   */
   public stackUsingArray()
   {
       myStack = new int[10];
       pointer = -1;//keep track of where the top element is on the stack.
   }

   /**
    -Pop method
   */
   public int pop()
  {      
      if(pointer==-1)
      {
          //throw exception here
      }
      return myStack[pointer--];
  }

  /**
  -Push when the stack is not empty.
  */

   public void push(int num)
   {
       if(pointer== myStack.size()-1)
       {
           //throw exception here
       }
       else
       {
            myStack[++pointer] = num;//add to the stack           
        }       
   }

/**
-return the top element of the stack
*/
   public void peek()
   {
       return pointer;
   }

/**
-return false if there is not more element on the stack
*/
   public boolean isEmpty()
   {
       return (pointer == -1)? true : false;
   }

   public static void main(String [] arg)
   {
       stackUsingArray newStack = new stackUsingArray();
       newStack.push(1);
       newStack.push(2);
       newStack.push(3);

       System.out.println(newStack.pop());
   }
}