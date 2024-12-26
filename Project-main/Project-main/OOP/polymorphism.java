// Base class
class Ode {
    void makeSound() {
        System.out.println("Some sound");
    }
}

// Derived class
class Dog extends AngeJel {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

// Another derived class
class Cat extends AngeJel {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Main class to test polymorphism
public class polymorphism {
    public static void main(String[] args) {
        // Creating objects 
        AngeJel myDog = new Dog();
        AngeJel myCat = new Cat();

        // Demonstrating polymorphism
        myDog.makeSound(); //  Woof
        myCat.makeSound(); //  Meow

    
    }
}
