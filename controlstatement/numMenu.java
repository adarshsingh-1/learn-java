package controlstatement;

import java.util.Scanner;

public class numMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print numbers 1 to N");
            System.out.println("2. Find factorial");
            System.out.println("3. Check even/odd");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial: " + fact);
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    int number = sc.nextInt();
                    if (number % 2 == 0)
                        System.out.println("Even");
                    else
                        System.out.println("Odd");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
