// Base class
class Ode {
    void makeSound() {
        System.out.println("Some sound");
    }
}

// Derived class
class Dog extends Ode {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

// Another derived class
class Cat extends Ode {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Main class to test polymorphism
public class polymorphism {
    public static void main(String[] args) {
        // Creating objects 
        Ode myDog = new Dog();
        Ode myCat = new Cat();

        // Demonstrating polymorphism
        myDog.makeSound(); //  Woof
        myCat.makeSound(); //  Meow

    
    }
}
