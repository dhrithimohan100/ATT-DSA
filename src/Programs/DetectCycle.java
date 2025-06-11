package Programs;

class node {
        int data;
        node next;

        node(int data) {

            this.data = data;
            this.next = null;
        }
    }
    public class DetectCycle {
        public static boolean detectCycle(node head) {
            node slow = head;
            node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            node head = new node(1);
            node second = new node(2);
            node third = new node(3);
            node fourth = new node(4);
            head.next = second;
            second.next = third;
            third.next = second;//cycle
            if (detectCycle(head)) {
                System.out.println("cyccle detected");
            } else {
                System.out.println("no cycle");
            }
        }
}





