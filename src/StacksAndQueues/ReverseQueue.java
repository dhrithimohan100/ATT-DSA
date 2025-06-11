package StacksAndQueues;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;


public class ReverseQueue {
    public static<T> void reverseQueue(Queue<T> queue){//"(Queue<T> queue)"this is thw ip queue i want to reverse
      Stack<T> stack=new Stack<>();//create a new stack
        // create a while loop where it keep removing the elemnts from queue
        //until its empty and keep pushing it to the stack whatever u remove from the Q
      while(!queue.isEmpty()){
          stack.push(queue.remove());
      }
      //now keep on poping the elemnts from the stack until its empty
        //and eneque it to the queue
      while(!stack.isEmpty()){
          queue.add(stack.pop());
      }
    }
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        //using LL because it supports Q operations
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("og queue"+queue);
        reverseQueue(queue);
        System.out.println("reversed queue"+queue);
    }
}
