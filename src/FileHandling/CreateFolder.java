package FileHandling;
import java.io.File;

public class CreateFolder {
    public static void main(String args[]){
        //Absolute path->Root Directoryyy
        File folder=new File("C:\\Users\\Dhrithi Mohan\\IdeaProjects\\ATT-1\\Java\\hi");
        if (folder.mkdir()){
            System.out.println("Folder "+folder.getName()+" created");
        }
        else{
            System.out.println("folder already exists");
        }
    }
}
