package array;

import java.util.Scanner;

public class _03array {
  //print the min and max of the array

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter the numbers");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int min = arr[0];
    int max = arr[0];

    for(int i = 1;i<n;i++){
      if(arr[i] < min){
        min = arr[i];
      }
      if(arr[i] > max){
        max = arr[i];
      }
    }

    System.out.println("The max of the array is:- "+max);
    System.out.println("The min of the array is:- "+min);


    sc.close();

  }

}
