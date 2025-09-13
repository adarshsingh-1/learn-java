package basics;

import java.util.Scanner;

public class student {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    System.out.println("Enter your class: ");
    int studentClass = sc.nextInt();

    System.out.println("Your name is: " + name);
    System.out.println("Your age is: " + age);
    System.out.println("Your class is: " + studentClass);


    System.out.println(name+" age is "+ age +" of class "+ studentClass +" found guilty ");

    sc.close();

  }

}
