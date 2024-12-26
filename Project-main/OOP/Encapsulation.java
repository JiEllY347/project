class Abs {
    // Private field
    private String breed;
    private String name;
    private int age;

    Abs(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Public method to access private field
    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Abs abs = new Abs("Buddy", 3, "Shiwawa ");
        System.out.println("Dog breed: " + abs.getBreed()); // Mo print Dog breed: Shiwawa
    }
}