package FileHandling;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file=new File("./Java/hi/bnmit.txt");
        if(file.createNewFile()) {
            System.out.println("File " + file.getName() + " created.");
        }
        else{
            System.out.println("failed to create the file");
        }
    }
}
