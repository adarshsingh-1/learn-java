package basics;

public class _08java {
  public static void main(String[] args) {
    //ternary operator

    // syntax: condition ? value_if_true : value_if_false;
    int a = 10;
    int b = 20;
    int max = (a > b) ? a : b;
    System.out.println("The maximum value is: " + max);

    int num = 15;
    String result = (num % 2 == 0) ? "Even" : "Odd";
    System.out.println(num + " is " + result);


    //unary operator
    int x = 5;
    System.out.println("Original x: " + x);

    System.out.println("Post-increment: " + (x++)); 

    System.out.println("After Post-increment x: " + x); 

    System.out.println("Pre-increment: " + (++x)); 
    
    System.out.println("After Pre-increment x: " + x); 
  }
  
}
