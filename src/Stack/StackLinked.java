package Stack;

import LinkedList.Node;

public class StackLinked {
    private Node head;

    public void push( int nodeValue ){
        Node node = new Node(nodeValue);
        if(head == null){
            head = node;
            node.next = null;
             }
        else {
            node.next = head;
            head = node;
           }
         }
    public int pop( ){
        int value = head.value;
        head = head.next;
    return value;
    }

    public int peek ( ){

        return head.value;
    }

}
