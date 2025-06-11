package StacksAndQueues;

public class Queue {
    private static final int MAX_SIZE=10;
    private int[]arr=new int[MAX_SIZE];
    private int front;
    private int rear;
    public Queue(){
        front=rear-1;//empty
    }
    public boolean isEmpty(){
        return(front==-1 && rear == -1);
    }
    public boolean isFull(){
        return rear== MAX_SIZE-1;
    }
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("queue is full! cant enequeue" + element);
            return;
        } else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        arr[rear] = element;
        System.out.println("the element enqueed is" + element);
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty! cant remove data");
        }else if(front==rear){
            front=rear=-1;
        }else{
            front++;
        }
    }
    public int getFront(){
        if(isEmpty()){
            System.out.println("queue is empty.no front element");
            return -1;
        }else {
            return arr[rear];
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public int size(){
        return rear+1;
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        int [] arr={10,20,30,40,50};
        for(int x:arr){
            queue.enqueue(x);
        }
        queue.display();
        System.out.println("front element:"+queue.getFront());
        //System.out.println("rear element:"+queue.getRear());
        System.out.println("Size:"+queue.size());
    }
}
