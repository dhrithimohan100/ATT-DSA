package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
        //FileWriter writer = new FileWriter("./Java/hi/bnmit.txt");//this erases the already present data
        FileWriter writer = new FileWriter("./Java/hi/bnmit.txt",true);// this holds the prev data and also adds new data
        writer.append("\n we will learn and evelop a simple app using spring");
        writer.close();
        System.out.println("successfully created");
    }
}
