class Ode {
    // Private field
    private String breed;
    private String name;
    private int age;

    Ode(String name, int age, String breed) {
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
        Ode ode = new Ode("Buddy", 3, "Golden Ode");
        System.out.println("Dog breed: " + ode.getBreed()); // Mo print Dog breed: Golden Ode
    }
}
