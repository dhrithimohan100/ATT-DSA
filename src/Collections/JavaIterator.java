package Collections;
import java.util.ArrayList;
import java.util.Iterator;


public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Porsche");
        names.add("Porsche");
        names.add("Porsche");
        Iterator<String> it=names.iterator();
    }

}
