// AngeJel class
//values sa constructor sa AngeJel class
abstract class AngeJel {
    String name;
    int age;

    AngeJel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void makeSound();
}

// Concrete class extending AngeJel class
class Dog extends AngeJel {

    Dog(String name, int age) {
        super(name, age);
    }

    // diri implementation sa AngeJel class
    @Override
    void makeSound() {
        System.out.println("Woof Woof ");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog Dog = new Dog("Adi", 5);
        Dog.makeSound(); // print diri Woof Woof
    }
}
