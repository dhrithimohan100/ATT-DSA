package FileHandling;
import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("./Java/hi/bnmit.txt");
        if(file.delete()) {
            System.out.println("File " + file.getName() + " deleted");
        }
        else{
            System.out.println("failed to delete the file");
        }
    }
}
