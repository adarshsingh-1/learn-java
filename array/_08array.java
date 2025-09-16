package array;

import java.util.*;

public class _08array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // second largest elemet

    System.out.println("Enter the number of elements");
    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int max = arr[0];
    int secMax = arr[0];

    for (int i = 1; i < n; i++) {
      if (max < arr[i]) {
        secMax = max;
        max = arr[i];
      } else if (arr[i] > secMax && arr[i] != max) {
        secMax = arr[i];
      }
    }
    System.out.println("the second largest element is " + secMax);

    sc.close();
  }

}
