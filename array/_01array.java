package array;

public class _01array {
  public static void main(String[] args) {

    // what is an array
    // An array is a collection of elements of the same data type.

    // declaration
    int[] numbers;
    // or
    int number[];

    // initialisation
    int[] num = new int[5];
    num[0] = 10;
    num[1] = 20;

    // direct initialisation
    int[] marks = { 90, 80, 70, 60, 50 };

    // looping through an array

    String[] heroes = new String[5];
    heroes[0] = "batman";
    heroes[1] = "superman";
    heroes[2] = "ironman";
    heroes[3] = "spiderman";
    heroes[4] = "captain america";

    for (int i = 0; i < heroes.length; i++) {
      System.out.println("The hero is  " + heroes[i]);
    }
    // or
    for (String hero : heroes) {
      System.out.println("The hero is " + hero);
    }

  }

}
