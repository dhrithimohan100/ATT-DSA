package LinkedList;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SLL {
    Node head;

    SLL() {
        head = null;
    }

    void insertAtHead(int val) {
        Node n = new Node(val);//creating a node
        n.next = head;//pointing the next of new node "n" to the head to get the addr of the already present node
        head = n;//point head towards new node
    }

    void insertAtTail(int val) {
        Node n = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    void insertAtPos(int val, int pos) {

        Node n = new Node(val);
        Node temp = head;
        while (--pos > 0) {
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }

    void deleteAtHead() {
        if (head != null) {
            Node temp = head;
            head = temp.next;
            temp = null;
        }
    }

    void deleteByVal(int val) {
        if (head == null) return;
        if (head.data == val) {
            deleteAtHead();
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;

        }
        if (temp.next == null) {
            System.out.println("value not found");
            return;
        }
        Node tobedeleted = temp.next;
        temp.next = temp.next.next;
        tobedeleted = null;
    }


    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");

    }
}



class DriverCode { //keeping different
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.insertAtTail(50);
        sll.insertAtPos(500,1);
        sll.deleteAtHead();
        sll.deleteByVal(20);
        sll.printLL();
    }
}