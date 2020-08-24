// Implementation of Stacks using Arrays with Generics

class Main {
  public static void main(String[] args) {
    Stack<Integer> myStack = new Stack<>(5);
    myStack.push(5);
    myStack.push(6);
    myStack.push(7);
    myStack.push(8);
    myStack.push(9);
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.isEmpty());
    System.out.println(myStack.peek());
    System.out.println(myStack.pop());
  }

 // Generic Implementation of Stack
  public static class Stack <T> {
      private T[] array;
      private int size;
      private int top;

      public Stack(int size) {
        this.size = size;
        array = (T[]) new Object[size];
        this.top = -1;
      }

      public void push(T data) {
        if (top + 1 > array.length) {
            System.out.println("Stack is already full. Cannot push items");
        }
        array[++top] = data;
      }

      public T pop() {
          if (top == -1) {
            System.out.println("There are no items to pop");
          }
          return array[top--];
      }

      public T peek() {
        return array[top];
      }

      public boolean isEmpty() {
          if (top == -1) {
            return true;
          }
          return false;
      }
  }
}
