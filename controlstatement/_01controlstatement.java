package controlstatement;

public class _01controlstatement {
  public static void main(String[] args) {
    // if statement

    int age = 18;
    if (age >= 18) {
      System.out.println("Eligible to vote");
    }

    // if-else statement
    int num = 5;
    if (num % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }

    // if-else-if ladder
    int marks = 75;
    if (marks >= 90) {
      System.out.println("Grade A");
    } else if (marks >= 75) {
      System.out.println("Grade B");
    } else {
      System.out.println("Grade C");
    }

  }
}