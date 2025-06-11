package NonLinear.Heaps;
//MAXHEAP

public class Heap {
    private int[] arr;
    private int size;

    public Heap() {
        arr = new int[101];
        arr[0] = -1;//sentinel Value//Just for reference
        size = 0;
    }

    private void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insert(int val) {
        size++;
        arr[size] = val;
        int index = size;
        while (index > 1) {
            int parent = index / 2;
            if (arr[parent] < arr[index]) {
                swap(parent, index);
                index=parent;
            } else {
                return;//its at the correvt position,no swap required
            }
        }
    }
    public void deleteFromHeap(){
        if(size==0) {
            System.out.println("ntg to delete .Empty heap");
            return;
        }
        arr[1]=arr[size];
        size--;//remove last element
        //propagate the root to its crct position
        int i=1;
        while(i<size){
            int leftIndex=2*i;
            int rightIndex=2*i+1;
            if(leftIndex <=size && arr[i]<arr[leftIndex]){
                swap(i,leftIndex);
                i=leftIndex;}
            else if(rightIndex<=size &&arr[i]<arr[rightIndex]){
                swap(i,rightIndex);
                i=rightIndex;
            }
            else{
                return;
            }
        }
    }


    public static void main(String[] args) {
        Heap maxHeap = new Heap();
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(10);
        maxHeap.insert(40);
        maxHeap.insert(50);
        maxHeap.print();
        maxHeap.deleteFromHeap();
        maxHeap.print();


    }
}
/// /heapify baribeku

