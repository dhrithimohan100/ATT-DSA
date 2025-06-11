package Collections;

import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(13);
        numbers.add(11);
        System.out.println(numbers);
        System.out.println(numbers.get(1));//this is calling element from 1st index
        @Deprecated//old practice
        ArrayList data=new ArrayList<>();
        data.add("1");
        data.add("c");
        System.out.println(data);
        /*ArrayList<String>names=new ArrayList<>();
        names.add("hello");
        names.add("disha");
        names.add("hi");
        System.out.println(names);
        System.out.println(names.get(2));

         */




    }
}
