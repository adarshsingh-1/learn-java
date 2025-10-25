package OOPs;

// Abstract class: cannot be instantiated, can have abstract and concrete methods
abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    // abstract method: forces subclasses to provide implementation
    abstract double area();

    // concrete method: common behavior for all shapes
    void printArea() {
        System.out.println(name + " area = " + area());
    }
}

// Concrete subclass 1
class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass 2
class Rectangle extends Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

public class _04oops {
    public static void main(String[] args) {
        // Shape s = new Shape("Any"); // Not allowed: Shape is abstract

        Shape c = new Circle(3.0);
        Shape r = new Rectangle(4.0, 5.0);

        c.printArea();
        r.printArea();
    }
}