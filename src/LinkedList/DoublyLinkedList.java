package LinkedList;

public class DoublyLinkedList {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Insert at head
    public void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head != null) {
            temp.next = head;
            head.prev = temp;
        }
        head = temp;
    }

    // Insert at tail
    public void insertAtTail(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
    }

    // Insert at a given position (1-based index)
    public void insertAtPosition(int data, int position) {
        Node temp = new Node(data);
        if(position<=0){
            System.out.println("Inavlid posistion");
            return;
            // the first position is teh first node
        }
        if (position == 1) {
            temp.next=head;
            if(head!=null){// here head== null also works
                head.prev=temp;
            }
            head=temp;
            return;
        }

        Node curr = head;
        int count = 1;

        while (curr != null && count < position - 1) {
            curr = curr.next;
            count++;
        }

        if (curr == null) {
            System.out.println("not in range");
            return;
        }
        temp.next=curr.next;
        temp.prev=curr;
        if(curr.next!= null){
            curr.next.prev=temp;}
        curr.next=temp;
        }



    // Delete at head
    public void deleteAtHead() {
        if (head == null) return;

        Node temp = head;
        head = head.next;

        if (head != null)
            head.prev = null;

        temp.next = null;
    }

    // Delete at tail
    public void deleteAtTail() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.prev.next = null;
        curr.prev = null;//JVM does this automatically optional step
    }

    // Delete at a given position (1-based index)
    public void deleteAtPosition(int position) {
        if (head == null || position <= 1) {
            deleteAtHead();
            return;
        }

        Node curr = head;
        int count = 1;

        while (curr != null && count < position) {
            curr = curr.next;
            count++;
        }

        if (curr == null) return;

        if (curr.next != null)
            curr.next.prev = curr.prev;

        if (curr.prev != null)
            curr.prev.next = curr.next;

        curr.prev = null;
        curr.next = null;
    }

    // Display list
    public void display() {
        Node temp = head;
        //j//ava.lang.Object System = null;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method to test
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtHead(10);
        dll.insertAtTail(20);
        dll.insertAtTail(30);
        dll.insertAtPosition(15, 2);
        dll.display(); // 10 <-> 15 <-> 20 <-> 30 <-> NULL

        dll.deleteAtHead();
        dll.deleteAtTail();
        dll.deleteAtPosition(2);
        dll.display(); // 15 <-> NULL
    }
}




