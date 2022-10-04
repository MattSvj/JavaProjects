/* 
  Реализовать стек с помощью массива.
  Реализовать методы:
  size(), empty(), push(), peek(), pop().
*/

public class Stack<T> {
    private T[] array;
    private int index;
    private int pointer;

    public Stack(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
        pointer = -1;
    }


    public int size() {
        return this.index;
    }
    public boolean empty() {
        return (this.size() == 0)? true : false;
    }
    public void push(T value) {
        if(pointer== this.size()-1)
       {
           //throw exception here
       }
       else
       {
        this.array[index++] = value;         
       }    

    }
    public T peek() {
        return this.array[index - 1];
    }
    public T pop() {
        if(pointer==-1)
      {
          //throw exception here
      }
        return this.array[--index];
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(100);
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
