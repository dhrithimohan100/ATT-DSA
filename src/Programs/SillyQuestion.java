package Programs;

public class SillyQuestion {
    public static void main(String[] args) {
        int n1=7,n2=4;
        String[] result={"even","odd"};
        System.out.println(n1+" is "+ result[n1%2]);
        System.out.println(n2+" is "+ result[n2%2]);
    }
}
