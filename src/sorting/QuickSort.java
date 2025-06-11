package sorting;

public class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partitionIndex(int[] arr, int s, int e) {
        int pivot = arr[s];
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }
        //place the pivot at the correct position or index
        int pivotIndex = s + count;
        swap(arr, pivotIndex, s);
        //let's manage the left and right side of pivot
        int i = s;
        int j = e;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i++, j--);
            }
        }
        return pivotIndex;
    }

    public static void quickSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        //find the pivot for partition
        int p = partitionIndex(arr, s, e);
        //Now,use recursion sort the left amd right part of the pivot
        //left part
        quickSort(arr, s, p - 1);
        //right part
        quickSort(arr, p + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 3, 10, 2, 6};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

