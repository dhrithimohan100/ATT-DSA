package sorting;

public class QuickSortDhr {
    public static void main(String[] args) {
        int [] arr={10,7,8,9,1,5};
        int n =arr.length;
         for(int start=0;start<n-1;start++) {
             for (int end = n - 1; end > start; end--) {
                 int pivot = arr[start];

                 int i = start + 1;
                 int j = end;
                 while (i <= j) {
                     //move till arr[i] is greater than pivot
                     while (i <= end && arr[i] < pivot) {
                         i++;
                     }
                     //dec j when it is less than P and till it reaches start
                     while (j > start && arr[j] > pivot) {
                         j--;
                     }

                     if (i < j) {
                         int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                     } else {
                         break;
                     }
                 }

                 int temp = arr[start];
                 arr[start] = arr[j];
                 arr[j] = temp;
             }
         }
        System.out.println("sorted Programs.array");
         for(int num:arr){
             System.out.print(num+" ");
         }
    }
}

