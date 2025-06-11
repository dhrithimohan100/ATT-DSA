package FileHandling;
import java.io.File;

/*public class DeleteFolder {
    public static void main(String args[]){
        //Absolute path->Root Directoryyy
        File folder=new File("C:\\Users\\Dhrithi Mohan\\IdeaProjects\\ATT-1\\Java\\dsa1");
        if (folder.delete()){
            System.out.println("Folder "+folder.getName()+" deleted");
        }
        else{
            System.out.println("folder doesn't exists");
        }
    }
}*/
public class DeleteFolder {
    public static void main(String args[]) {
        //Relative path
        File folder = new File("./Java/hi");
        if (folder.delete()) {
            System.out.println("Folder " + folder.getName() + " deleted");
        } else {
            System.out.println("folder doesn't exists");
        }
    }
}

