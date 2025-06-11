package Collections;
//StringBuffer
public class BufferExample {
    public void stringAppend() {
        StringBuffer buffer = new StringBuffer("core");
        System.out.println("original" + buffer);
        buffer.append("java");
        System.out.println("New String:" + buffer);
    }

    public void stringInsert() {
        StringBuffer buffer = new StringBuffer("JA");
        System.out.println("original string" + buffer);
        buffer.insert(1, "AV:");
        System.out.println("New string:" + buffer);
    }

    public void stringReverse() {
        StringBuffer buffer = new StringBuffer("TIMNB");
        System.out.println("original string:" + buffer);
        buffer.reverse();
        System.out.println("New string:" + buffer);
    }

    public static void main(String[] args) {
        new BufferExample().stringAppend();
        new BufferExample().stringAppend();
        new BufferExample().stringAppend();
        new BufferExample().stringReverse();


    }
}
//instead of StringBuffer do StringBuilder
