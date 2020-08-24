
// Implementation of Queues using Arrays with Generics

class Main {
  public static void main(String[] args) {
    Queue<Integer> queue = new Queue<>(5);
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);
    queue.view();
    System.out.println(queue.peek());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.peek());
    System.out.println(queue.dequeue());
    System.out.println(queue.isEmpty());
  }

  public static class Queue <T> {
    private T[] array;
    private int size; // size of the queue
    private int front; // beginning of the queue pointer
    private int rear; // end of the queue pointer

    public Queue(int size) {
    this.size = size;
    this.array = (T[]) new Object[size];
    this.front = 0; 
    this.rear = -1;
    }

    public void enqueue(T data) { // add to the end of the Queue
      rear++; 
      array[rear] = data;
    }

    public T dequeue() { // Remove from beginning of Queue
      size--; 
      return array[front++];
   }

    public void view() {
    System.out.print("[");
    for(int i=0; i < array.length; i++) {
      System.out.print(array[i]+ " ");
    }
     System.out.println("]");
  }

  public T peek() { // Return the first element in the Queue
    return array[front];
  }

  public boolean isEmpty() {
    if (size == 0 ) {
      return true;
    }
    return false;
  }

  }

}