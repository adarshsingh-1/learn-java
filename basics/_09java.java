package basics;

import java.util.Scanner;

public class _09java {
  public static void main(String[] args) {
    // input and output

    System.out.print("Hello, "); // prints text without a newline
    System.out.println("Hello, World!"); // prints a line of text
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine(); // reads a line of text
    System.out.println("Hello, " + name + "!");

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();// reads an integer
    System.out.println("You are " + age + " years old.");

    scanner.close();
  }

}
