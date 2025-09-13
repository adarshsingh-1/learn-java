package basics;

public class _02java {
  public static void main(String[] args) {
    // rules for naming variables in Java
    // 1.cannot start with a digit
    // 2.no spaces or special characters except _ and $
    // 3.cannot use Java reserved keywords
    // 4.use camelCase like studentName, studentAge
    // 5. In Java, you must initialize local variables before use. Using an
    // uninitialized local variable causes a compiler error.
    // Data Types in Java

    // Primitive Data Types:

    // byte: 1 byte, range: -128 to 127
    byte b = 100;
    System.out.println(b);

    // short: 2 bytes, range: -32,768 to 32,767
    short s = 10000;
    System.out.println(s);

    // int: 4 bytes, range: -2,147,483,648 to 2,147,483,647
    int i = 100000;
    System.out.println(i);

    // long: 8 bytes, range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    long l = 10000000000L;
    System.out.println(l);

    // float: 4 bytes, single-precision 32-bit IEEE 754 floating point
    float f = 3.14f;
    System.out.println(f);

    // double: 8 bytes, double-precision 64-bit IEEE 754 floating point
    double d = 2.718281828459045;
    System.out.println(d);

    // char: 2 bytes, single 16-bit Unicode character
    char c = 'A';
    System.out.println(c);

    // boolean: 1 bit, values: true or false
    boolean isJavaFun = true;
    System.out.println(isJavaFun);

    // Non-Primitive Data Types:
    // String: A sequence of characters, e.g., "Hello, World!"
    // Arrays: A collection of elements of the same type, e.g., int[] arr = {1, 2,
    // 3};
    // Classes: User-defined data types that can contain fields and methods.
    // Interfaces: Abstract types that define a contract for classes to implement.

    String name = "Adarsh";
    System.out.println(name);
    System.out.println("Hello, " + name + "!");

    // how to declare and initialize an array in Java
    int arr[] = new int[5];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);
    // or
    int num[] = { 1, 2, 3, 4, 5 };
    System.out.println(num[0]);
    System.out.println(num[1]);
    System.out.println(num[2]);
    System.out.println(num[3]);
    System.out.println(num[4]);
    // or
    for (int j = 0; j < num.length; j++) {
      System.out.println(num[j]);
    }
    // or
    for (int n : num) {
      System.out.println(n);
    }

    // class is a blueprint for creating objects
    class Student {
      int age;
      String name;

      void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
      }
    }
    Student student1 = new Student();
    student1.name = "Adarsh";
    student1.age = 20;
    student1.displayInfo();

  }

}
