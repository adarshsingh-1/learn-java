package basics;

public class _05java {
  public static void main(String[] args) {
    //logical operators

    int a = 10;
    int b = 5;
    int c = 15;

    // logical AND - both conditions must be true
    System.out.println((a > b) && (a < c)); 

    // logical OR - at least one condition must be true
    System.out.println((a > b) || (a > c));

    // logical NOT - negates the condition
    System.out.println(!(a > b));

    // logical XOR - true if exactly one condition is true
    System.out.println((a > b) ^ (a < c));
    

  
  }
  
}
