package Collections;
import java.util.List;
import java.util.ArrayList;

public class WildCard {
    public static void printListElements(List<?> list) {
        for(Object obj:list){
            System.out.print(obj+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        printListElements(integerList);
        List<String> stringList =new ArrayList<>();
        stringList.add("java");
        stringList.add("c++");
        printListElements(stringList);

    }
}
