package StacksAndQueues;

import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("apple");
        stack.push("pineapple");
        System.out.println("stack"+stack);
        String popped=stack.pop();
        System.out.println("popped item"+popped);
        System.out.println("current size " +stack.size());
    }


}
