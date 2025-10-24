package filehandling;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class _02file {
  public static void main(String[] args) {
    //code to write in a file
    try {
      FileWriter myFileWriter = new FileWriter("01file.txt");
      myFileWriter.write("Hello, this is file handling in Java!");
      myFileWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}