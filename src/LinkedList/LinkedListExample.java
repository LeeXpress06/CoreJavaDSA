package LinkedList;
//public class LinkedListExample {
//
//    public Node head;
//    public Node tail;
//    public int size;
//
//    public Node createSingleLinkedList( int nodeValue){
//
//        Node newNode = new Node(nodeValue);
//        newNode.next = null;
//        head = tail = newNode;
//         size = 1;
//        return head;
//    }
//
//    // let create a adding first position
//
//    public void addFirst( int nodeValue){
//
//        Node  node = new Node(nodeValue);
//        node.next = head;
//        head = node;
//        size++;
//        if(size == 0){
//            tail = node;
//        }
//    }
//    public void addLast(int nodeValue){
//        Node node = new Node(nodeValue);
//         node.next = null;
//         tail = node;
//         size++;
//        tail.next = node;
//    }
//
//    // playing with address , not value. find address of two node by traversing
//    public void addAt(int nodeValue, int index){
//        Node node = new Node(nodeValue);
//        Node temp = head;
//        for(int k = 0; k < index ; index++){
//            temp = temp.next;
//        }
//         // next one will be assigned to the current one that we are placing
//        node.next = temp;
//        temp = node;
//        size++;
//
//    }
//
//    public void display( ){
//        Node current = head;
//        while(current.next != null){
//            System.out.print(head.value);
//            current = current.next;
//        }
//        System.out.println("->");
//    }
//}


public class LinkedListExample {

    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue) {
        Node newNode = new Node(nodeValue);
        newNode.next = null;
        head = tail = newNode;
        size = 1;
        return head;
    }

    public void addFirst(int nodeValue) {
        Node node = new Node(nodeValue);
        node.next = head;
        head = node;
        size++;
        if (size == 1) {
            tail = node;
        }
    }

    public void addLast(int nodeValue) {
        Node node = new Node(nodeValue);
        node.next = null;
        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addAt(int nodeValue, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            addFirst(nodeValue);
        } else if (index == size) {
            addLast(nodeValue);
        } else {
            Node node = new Node(nodeValue);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
