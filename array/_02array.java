package array;

import java.util.*;

public class _02array {
  public static void main(String[] args) {

    // take 5 numbers from user and print sum
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); 
    int arr[] = new int[n]; 

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt(); 
    }

    
    for (int i = 0; i < n; i++) {
      System.out.println("Element at index " + i + " is " + arr[i]);
    }

    int sum = 0;
    for(int i = 0;i<n;i++){
      sum+=arr[i];
    }
    System.out.println("The sum is "+ sum);

    sc.close();

  }

}
