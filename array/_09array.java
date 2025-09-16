package array;

import java.util.Scanner;

public class _09array {
  public static void main(String[] args) {
    // count frequency of elements
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements");
    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int maxVal = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] > maxVal) {
        maxVal = arr[i];
      }
    }

    int[] count = new int[maxVal + 1];

    for (int i = 0; i < n; i++) {
      count[arr[i]]++;
    }

    int maxFreq = 0;
    int element = -1;
    for (int i = 0; i < count.length; i++) {
      if (count[i] > maxFreq) {
        maxFreq = count[i];
        element = i;
      }
    }

    System.out.println(element + " has the highest frequency: " + maxFreq);

    sc.close();

  }

}
