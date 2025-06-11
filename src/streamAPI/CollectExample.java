package streamAPI;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class CollectExample {
    public static void main(String[] args) {
        List<Integer>numbers=Arrays.asList(1,2,3,4,5);
        List<Integer> evenNumbers=numbers.stream().//gives the stream of numbers
                filter(n->n%2==0).//filters base don condition
                collect(Collectors.toList());//collect and put it back to evennumbers list
        System.out.println("even numbers:"+evenNumbers);
    }
}
