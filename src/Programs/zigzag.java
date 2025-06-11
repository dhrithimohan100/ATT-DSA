package Programs;

public class zigzag {
    static void zigzag(int cols) {
        for(int r=1;r<=3;r++){
            for(int c=1;c<=cols;c++)
            {if(r==1 && c%4==3 ||
                   r==2 && c%2==0 ||
                   r==3 && c%4==1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");//give 3 times space
                }
            }
            System.out.println();
                }
            }
    public static void main(String[] args) {
        zigzag(9);

        zigzag(17);
    }
}
/// if(r+c%4==0||r==2&&c%4==0)
