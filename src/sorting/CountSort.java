package sorting;

import java.util.Arrays;

public class CountSort {
    public static void count(int [] arr){
        // step1=find the max
        int k=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>k){
                k=arr[i];

            }
        }
        // create a count Programs.array of 0 to max
        int[] count=new int[k+1];
        // calculate the frequency of each element in the Programs.array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //calculate the cumulative count
        //c=c+p
        //skip index 0 and go from 1 till max
        // because index 0 doesnt have prev index
        for( int i=1;i<=k;i++) {
            count[i] += count[i - 1];
        }
        //create the output Programs.array
        int[] output=new int[arr.length];
        //start from the end of the Programs.array ->R to L
        for(int i=arr.length-1;i>=0;i--){
            output[--count[arr[i]]]=arr[i];
        }
        //copy the output back to input
        //for(int i=0;i<arr.length;i++){
        // arr[i]=output[i];
        // }
        System.arraycopy(output,0,arr,0,arr.length);//
    }

    public static void main(String[] args) {
        int[] arr={6,4,3,4,1,3,2,3,1};
        System.out.println("before sorting: ");
        System.out.println(Arrays.toString(arr));

        count(arr);
        System.out.println("after sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}