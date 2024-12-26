class Ode {
    // Private field
    private String bambi;
    private String name;
    private int age;

    Ode(String name, int age, String bambi) {
        this.name = name;
        this.age = age;
        this.bambi = bambi;
    }

    // Public method to access private field
    public String getBambi() {
        return bambi;
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
        Pet pet = new Pet("Bogs", 3, "Milky mik");
        System.out.println("Dog breed: " + Pet.getBambi()); // Mo print Dog breed: Golden Ode
    }
}
