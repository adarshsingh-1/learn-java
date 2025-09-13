package basics;

import java.util.*;

public class numberGuessing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // generate a number 1-100
    int target = (int) (Math.random() * 100) + 1;

    // let the user guess the number
    int userNum;
    System.out.println("Guess the number between 1 and 100:");

    while (true) {
      userNum = sc.nextInt();
      if (userNum > target) {
        System.out.println("It is less than " + userNum);
      } else if (userNum < target) {
        System.out.println("It is more than " + userNum);
      } else {
        System.out.println("Correct! The number was " + target);
        break;
      }
    }
    sc.close();

  }

}


// Math.random() returns a double between 0.0 (inclusive) and 1.0 (exclusive).
// Multiplying by 100 gives a value from 0.0 up to (but not including) 100.0.
// Casting to int truncates the decimal, resulting in an integer from 0 to 99.
// Adding 1 shifts the range to 1 to 100.
