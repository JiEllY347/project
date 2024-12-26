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
class Bird extends AngeJel {

    Bird(String name, int age) {
        super(name, age);
    }

    // diri implementation sa AngeJel class
    @Override
    void makeSound() {
        System.out.println("Tweet Tweet");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Bird bird = new Bird("Adi", 5);
        bird.makeSound(); // print diri Tweet Tweet
    }
}
