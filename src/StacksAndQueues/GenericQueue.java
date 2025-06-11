package StacksAndQueues;

public class GenericQueue<T> {
    private static int MAX_SIZE = 5;
    private Object[] arr;
    private int front;
    private int rear;
    private int size;//tracks how many elements are currently in queue

    //constructor
    public GenericQueue() {
        this.arr = new Object[MAX_SIZE];
        this.front = 0;
        this.rear = -1;//no element in Q
        this.size = 0;
    }

    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Q overflow");
        } else {//in queue the insertion happens at rear end
            rear = (rear + 1) % MAX_SIZE;
            arr[rear] = data;
            size++;
            System.out.println("enqueed" + data);
        }
    }

    public T dequeue() {//look at the way u call the function using"T"
        if (isEmpty()) {
            System.out.println("queue underflow");
            return null;
        } else {
            T item = (T)arr[front];
            front = (front + 1) % MAX_SIZE;
            size--;
            System.out.println("dequeued" + item);
            return item;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            return (T) arr[front];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % MAX_SIZE;
                System.out.print(arr[index] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GenericQueue<Integer> intQueue = new GenericQueue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        intQueue.printQueue();

        intQueue.dequeue();
        intQueue.printQueue();

        GenericQueue<String> strQueue = new GenericQueue<>();
        strQueue.enqueue("Java");
        strQueue.enqueue("DSA");
        strQueue.printQueue();

        strQueue.dequeue();
        strQueue.printQueue();
    }
}
