package filehandling;
import java.util.*;
import java.io.File;
import java.io.IOException;


public class _01file {
  public static void main(String[] args) {
    //code to create a new File
    File myFile = new File("01file.txt");
    try{
      myFile.createNewFile();
    }catch(IOException e){
      System.out.println("Unable to create File");
      e.printStackTrace();
    }

   

  }
  
}
