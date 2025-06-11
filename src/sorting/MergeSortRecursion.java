package sorting;

import java.util.Arrays;
public class MergeSortRecursion {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {//if the lengthis 1, we stop dividing the arraty further
            return;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);//Break down the left Programs.array using recursion
        mergeSort(right);//break down the right Programs.array using recursion
        merge(arr, left, right);//merge two sorted arraysinto single arrays
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {// remaining elements from left part if any
            arr[k++] = left[i++];
        }
        while (j < right.length) {// remaining elements from right part if any
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,-1,-2,5,2,3,4,5};

       mergeSort(arr);
        System.out.println("merged Programs.array" + Arrays.toString(arr));
    }
}



