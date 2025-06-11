package StacksAndQueues;

public class StringStack {
    private static final int MAX_SIZE=5;
    private String[] arr=new String[MAX_SIZE];
    private int top=-1;
    public void push(String data){
        if(top==MAX_SIZE-1){
            System.out.println("Stack overflow! cannot push"+data);
            return;
        }
        arr[++top]=data;
        System.out.println("pushed:"+data);
    }
    public String pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return null;
        }
        String popped=arr[top--];
        System.out.println("popped"+popped);
        return popped;
    }
    public String peek() {
        if (top == -1) {
            System.out.println("stack underflow");
            return null;
        }
        return arr[top];
    }
    public boolean isEmpty() {
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
        }
        public int size(){
        return top+1;
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("stack underflow.no top element");
            return;
        }
        System.out.println("stack elements");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StringStack stack=new StringStack();
        stack.push("apple");
        stack.push("mango");
        stack.push("banana");
        stack.push("berry");
        System.out.println("top element"+stack.peek());
        stack.printStack();
        stack.pop();
        stack.printStack();
    }

    }

