package array;

import java.util.*;

public class _07array {
  public static void main(String[] args) {

    // binary search -> array should be sorted
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of Eelements");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the element you want to search");
    int tar = sc.nextInt();

    int left = 0;
    int right = n - 1;
    boolean found = false;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == tar) {
        System.out.println("The element is present");
        found = true;
        break;
      } else if (tar < arr[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    if (!found) {
      System.out.println("The element is not present");
    }
    sc.close();

  }

}
