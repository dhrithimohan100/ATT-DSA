package StacksAndQueues;
import java.util.Stack;
class ListNode{
    int data;
    ListNode next;
    ListNode(int val){
        data=val;
        next=null;
    }
}
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head){
        Stack<Integer>stack =new Stack<>();
        ListNode temp=head;
        //first traversal
        while(temp!=null){
            stack.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        // now compare the nodes with top of the stack
        while(temp!=null){
            if(temp.data!=stack.pop()){
                return false;
            }
            temp=temp.next;
        }
        return true;


    }

    public static void main(String[] args) {
        //1->2->3->null
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(1);
        System.out.println(isPalindrome(head)? "palindrome ":"not palindrome");
    }
}
