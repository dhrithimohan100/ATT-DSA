package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void select(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
                if (minIndex != i) {
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }

        public static void main(String[] args){
            int [] arr={3,2,1,4};
            select(arr);
            System.out.println(Arrays.toString(arr));


    }
}
