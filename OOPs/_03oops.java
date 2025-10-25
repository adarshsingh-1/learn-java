package OOPs;

// Compile-time polymorphism: method overloading
class Calculator {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
    double add(double a, double b) { return a + b; }
}

// Run-time polymorphism: method overriding + dynamic dispatch
class Bird {
    String name;
    void speak() {
        System.out.println(name + " makes a sound");
    }
}

class Sparrow extends Bird {
    @Override
    void speak() {
        System.out.println(name + " chirps");
    }
}

class Parrot extends Bird {
    @Override
    void speak() {
        System.out.println(name + " talks");
    }
}

public class _03oops {
    public static void main(String[] args) {
        // Overloading
        Calculator calc = new Calculator();
        System.out.println("add(2,3) = " + calc.add(2, 3));
        System.out.println("add(2,3,4) = " + calc.add(2, 3, 4));
        System.out.println("add(2.5,3.5) = " + calc.add(2.5, 3.5));

        // Overriding
        Bird b1 = new Sparrow(); b1.name = "Sparrow";
        Bird b2 = new Parrot();  b2.name = "Parrot";

        Bird[] birds = { b1, b2 };
        for (Bird b : birds) {
            b.speak(); // calls the overridden method of the actual object
        }
    }
}