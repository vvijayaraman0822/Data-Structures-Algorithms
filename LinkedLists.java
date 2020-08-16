// Implementation of LinkedList with couple of helper methods.

class Main {
  public static void main(String[] args) {
   LinkedList list = new LinkedList();
   list.appendToTail(10);
   list.appendToTail(20);
   list.appendToTail(30);
   list.appendToTail(40);
   list.appendToHead(8);
   list.appendToHead(4);
   list.deleteNodeWithValue(4);
   list.printAllNodes();
  }

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public static class LinkedList {
    public Node head;

// Adding a Node to the beginning of the LinkedList
    public void appendToHead(int data) {
      Node newHead = new Node(data);
      newHead.next = head;
      head = newHead;
    }

// Adding a Node to the end of the Linked List
  public void appendToTail(int data) {
    if (head == null) {
      head = new Node(data);
      return;
    }
    Node current = this.head;
    while(current.next != null) {
      current = current.next;
    }
    current.next = new Node(data);
  }

// Delete a Node with certain value
  public void deleteNodeWithValue(int data) {
    if (head == null) {
      return;
    }
    // if the Node to delete is the Head node 
    if (head.data == data) {
      head = head.next; // make the second element the head
      return;
    }
    Node current = head;
    while(current != null) {
      if (current.next.data == data) {
          current.next = current.next.next;
          return;
      }
      current = current.next;
    }
  }

// Traverse and print all nodes
    public void printAllNodes() {
      Node current = head;
      while(current != null) {
        System.out.println(current.data);
        current = current.next;
      }
    }
  }
}