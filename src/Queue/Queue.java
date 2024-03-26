package Queue;

import LinkedList.Node;

public class Queue {
      private Node head;
      private Node tail;
      private int size;

    public Queue() {
        // empty constructure
    }
    public void enQueue(int data){
        Node node = new Node(data);
        if(head == null){
            node.next = null;
            head = tail = node;
            size++;
        }
        else {
         node.next = null;
         tail.next =node;
         tail = node;
        }
    }
     public int peek( ){

      return head.value;


     }





}
