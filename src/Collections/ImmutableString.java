package Collections;

public class ImmutableString {
    public static void main(String[] args) {
        String name="BNMIT";
        System.out.println("Lower Case "+name.toLowerCase());
        System.out.println(("original "+name));
        StringBuffer buffer=new StringBuffer("JAVA");
        System.out.println("og string "+buffer);
        buffer.reverse();
        System.out.println("New String "+buffer);
    }
}
