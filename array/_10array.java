package array;

import java.util.Scanner;

public class _10array {
  public static void main(String[] args) {
    //find duplicate
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements");
    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for(int i = 0;i<n;i++){
      for(int j = i+1;j<n;j++){
        if(arr[i] == arr[j]){
          System.out.println("The duplicate element is "+arr[i]);
        }
      }
    }

    sc.close();
  }

}
