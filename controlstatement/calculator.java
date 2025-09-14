package controlstatement;

import java.util.*;

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first number");
    int numOne = sc.nextInt();
    System.out.println("Enter the second number");
    int numSec = sc.nextInt();

    System.out.println("Enter the operator (+, -, *, /):");
    char operator = sc.next().charAt(0);
    int ans = 0;

    switch (operator) {
      case '+':
        ans = numOne + numSec;
        break;
      case '-':
        ans = numOne - numSec;
        break;
      case '*':
        ans = numOne * numSec;
        break;
      case '/':
        ans = numOne / numSec;
        break;
      case '%':
        ans = numOne / numSec;
      default:
        System.out.println("Invalid operator");
    }

    System.out.println("Result: " + ans);
    sc.close();
  }

}
