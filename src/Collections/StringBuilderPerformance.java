package Collections;

public class StringBuilderPerformance {


    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        StringBuffer buffer=new StringBuffer("BNMIT");
        for(int i=1;i<100;i++){//i<10000000
            buffer.append("college");
        }
        System.out.println("Buffer time:"+(System.currentTimeMillis()-startTime)+"ms");

        StringBuilder builder=new StringBuilder("BNMIT");
        for(int i=1;i<100;i++) {
            builder.append("college");
        }
        System.out.println("Buffer time:"+(System.currentTimeMillis()-startTime)+"ms");

    }
    }

