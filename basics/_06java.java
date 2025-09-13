package basics;

public class _06java {
  public static void main(String[] args) {
    //bitwise operators - operate on bits and perform bit-by-bit operations
    
    int a = 5;  // binary: 0101
    int b = 3;  // binary: 0011

    // bitwise AND
    System.out.println(a & b); 

    // bitwise OR
    System.out.println(a | b);

    // bitwise XOR
    System.out.println(a ^ b);

    // bitwise NOT
    System.out.println(~a);
    System.out.println(~b);
  }
  
}
