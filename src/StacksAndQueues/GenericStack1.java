package StacksAndQueues;
public class GenericStack1<T>{//generic class
//<T> means class can handle any type
    private static int MAX_SIZE = 5;//max size is 5 and it is static because it is shared across all objects
    private Object[] arr;
    private int top;

    public GenericStack1() {
        this.arr = new Object[MAX_SIZE];
        this.top = -1;
    }

    public void push(T data) {
        if (this.top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow! Cannot push " + data);
        } else {
            this.arr[++this.top] = data;
            System.out.println("Pushed: " + data);
        }
    }

    public T pop() {
        if (this.top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return null;
        } else {
            T popped = (T)this.arr[this.top--];
            System.out.println("Popped: " + popped);
            return popped;
        }
    }

    public T peek() {
        if (this.top == -1) {
            System.out.println("Stack is empty.");
            return null;
        } else {
            return (T)this.arr[this.top];
        }
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == MAX_SIZE - 1;
    }

    public int size() {
        return this.top + 1;
    }

    public void printStack() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");

            for(int i = 0; i <= this.top; ++i) {
                Object var10001 = this.arr[i];
                System.out.print(var10001 + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        GenericStack1<Integer> intStack = new GenericStack1<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.printStack();
        GenericStack1<String> stringStack = new GenericStack1<String>();
        stringStack.push("BNMIT");
        stringStack.push("JAVA-DSA");
        stringStack.printStack();
    }
}
