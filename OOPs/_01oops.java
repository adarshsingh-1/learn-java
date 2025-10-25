package OOPs;

// Parent class (Superclass)
class Animal {
    String name;
    void eat() {
        System.out.println(name + " is eating");
    }
    
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Child class (Subclass) inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

// Another Child class
class Cat extends Animal {
    void meow() {
        System.out.println(name + " is meowing");
    }
}

public class _01oops {
    public static void main(String[] args) {
        // Create Dog object
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Dog's own method
        
        System.out.println();
        
        // Create Cat object
        Cat myCat = new Cat();
        myCat.name = "Whiskers";
        myCat.eat();    // Inherited from Animal
        myCat.sleep();  // Inherited from Animal
        myCat.meow();   // Cat's own method
    }
}