package FileHandling;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException{
        File file =new File("./Java/hi/bnmit.txt");
        Scanner reader=new Scanner(file);
        while(reader.hasNext()){
            String data=reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}
