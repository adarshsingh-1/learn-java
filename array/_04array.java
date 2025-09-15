package array;

public class _04array {
  public static void main(String[] args) {
    //reverse an array
    int arr[] = { 1, 3, 4, 5, 8 };
    int n = arr.length;
    System.out.println("The reverse is :");
    for (int i = n - 1; i >= 0; i--) {
      System.out.println(arr[i]);
    }

    // or
    for (int i = 0; i < n / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = temp;
    }

    System.out.println("The reversed array is:");
    for (int num : arr) {
      System.out.print(num + " ");
    }

  }
}
