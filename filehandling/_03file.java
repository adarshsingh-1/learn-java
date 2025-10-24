package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _03file {
  public static void main(String[] args) {
    //reading a file
    File myFile = new File("01file.txt");
    try{
      Scanner sc = new Scanner(myFile);
      while(sc.hasNextLine()){
        String line = sc.nextLine();
        System.out.println(line);
      }
      sc.close();
    }catch(FileNotFoundException e){
      e.printStackTrace();
    }
    
  }
  
}