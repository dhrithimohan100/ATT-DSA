package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                //shift operation
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;// fill the space with temp value
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
