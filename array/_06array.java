package array;

import java.util.Scanner;

public class _06array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // linear search

 
    int n = sc.nextInt();
    int arr[] = new int[n];


    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }


    int num = sc.nextInt();
    boolean isPresent = false;

    for (int i = 0; i < n; i++) {
      if (num == arr[i]) {
        isPresent = true;
        break; 
      }
    }


    if (isPresent) {
      System.out.println(num + " is present in the array");
    } else {
      System.out.println(num + " is not present in the array");
    }

    sc.close();
  }
}
