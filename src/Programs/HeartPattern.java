package Programs;

// make it a matrix
//divide it into patterns like p1,p2,p3..
//find similiar patterns in the made patterns
public class HeartPattern {
    public static void main(String[] args) {
        for(int r=0;r<6;r++){
            for(int c=0;c<7;c++){
                //proper heart
               if(r==0 && c%3 !=0||
                r==1 && c%3==0||
                r-c==2 || r+c==8){
                //reverse heart
               /* if(r==5 && c%3 !=0||
                        r==4 && c%3==0||
                        r-c==-3 || r+c==3)*/
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");//give 3 times space
                }
            }
            System.out.println();
        }
    }
}
