package controlstatement;
import java.util.*;


public class mutliplicationTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number for which you want the table: -");
    int num = sc.nextInt();

    for(int i = 1; i<=10;i++){
      System.out.println(num+"*"+i +"=" +(num*i));
    }

    sc.close();
    
  }
  
}
