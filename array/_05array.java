package array;

import java.util.*;

public class _05array {
  public static void main(String[] args) {
    //check if an array is sorted 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean isSorted = true;
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < n - 1; i++) { 
      if (arr[i] > arr[i + 1]) { 
        isSorted = false;
        break;
      }
    }

    if (isSorted) {
      System.out.println("The array is sorted");
    } else {
      System.out.println("The array is not sorted");
    }

    sc.close();

  }

}
