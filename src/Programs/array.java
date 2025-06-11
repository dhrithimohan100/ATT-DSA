package Programs;

public class array{
    public static void main(String[] args) {
        int [] arr={3,1,5,2,1,3,2};
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
        System.out.println("the non-repetaing element is:"+result);
        System.out.println(~5);//this is the absolute value of binary form of 5
        //~n=-n-1
        }
    }
