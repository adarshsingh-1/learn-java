package filehandling;
import java.io.File;

public class _04file {
  public static void main(String[] args) {
    //deleting a file in java

    try {
      File myFile = new File("01file.txt");
      if(myFile.delete()){
        System.out.println("I have deleted " + myFile.getName());
      } else {
        System.out.println("File does not exist or cannot be deleted");
      }
    } catch (SecurityException e) {
      System.out.println("Permission denied to delete the file");
      e.printStackTrace();
    }

  }
  
}