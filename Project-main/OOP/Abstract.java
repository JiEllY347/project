// Bonalos class
//values sa constructor sa Bonalos class
abstract class Bonalos {
    String name;
    int age;

    Bonalos(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void makeSound();
}

// Concrete class extending Bonalos class
class Dog extends Bonalos {

    Dog(String name, int age) {
        super(name, age);
    }

    // diri implementation sa Bonalos class
    @Override
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        dog.makeSound(); // print diri Woof Woof
    }
}
