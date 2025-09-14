package basics;

import java.util.*;

public class studentGrade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the student name:- ");
    String name = sc.nextLine();
    System.out.println("Enter the student class:- ");
    int studentClass = sc.nextInt();

    int totalMarks = 0;
    for (int i = 1; i < 5; i++) {
      System.out.println("Enter the marks in subject " + i);
      int marks = sc.nextInt();
      totalMarks += marks;
    }
    System.out.println("Report Card of " + name + " is:");
    System.out.println("Class: " + studentClass);
    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Average: " + (totalMarks / 4.0));

    sc.close();

  }

}
