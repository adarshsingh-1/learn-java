package strings;

import java.util.*;

public class _06string {
  public static void main(String[] args) {
    //how to use string buidler

    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a word to reverse: ");
    String str = sc.next();

    sb.append(str);
    sb.reverse();
    String rev = sb.toString();
    System.out.println("Reversed string: " + sb.toString());

    if(rev == str){
      System.out.println("It is a palindrome");
    }else{
      System.out.println("It is not a palindrome");
    }

    sc.close();

  }

}
