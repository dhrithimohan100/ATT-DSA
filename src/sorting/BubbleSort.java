package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {// in void we will not return,we just update the value
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
        public static void main(String[] args){
            int [] arr={7,6,5,3};
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

