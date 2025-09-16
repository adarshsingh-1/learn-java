package array;

public class _11array {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int n = arr.length;
    int k = 2; 

    int rotated[] = new int[n];
    for (int i = 0; i < n; i++) {
      rotated[(i + k) % n] = arr[i];
    }

    System.out.println("Rotated array:");
    for (int num : rotated) {
      System.out.print(num + " ");
    }
  }

}
