class Node {
    int data;
    Node prev;
    Node next;
 
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
 
class DoublyLinkedList {
    Node head;
 
    DoublyLinkedList() {
        this.head = null;
    }
 
   
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
 
        if (head == null) {
            head = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
 
    
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
 
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
 
            last.next = newNode;
            newNode.prev = last;
        }
    }
 
   
    public void deleteFromBegin() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            head.prev = null;
        }
    }
 
    
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
 
            last.prev.next = null;
        }
    }
 
    
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}
