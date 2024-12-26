// Class representing a Fruit
class Fruit {
    private String name;

    // Constructor
    public Fruit(String name) {
        this.name = name;
    }

    // Getter for the name
    public String getName() {
        return name;
    }
}

// Class representing Kuda
class Kuda {
    private Fruit favoriteFruit;

    // Constructor
    public Kuda(Fruit favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }

    // Method to get the favorite fruit
    public void showFavoriteFruit() {
        System.out.println("Kuda's favorite fruit is: " + favoriteFruit.getName());
    }
}

// Main class to test association
public class association {
    public static void main(String[] args) {
        // Creating Fruit objects
        Fruit watermelon = new Fruit("Watermelon");
        Fruit manggo = new Fruit("Manggo");
        Fruit avocado = new Fruit("Avocado");

        // Creating Gerald object with an associated favorite fruit
        Kuda kudaWithWatermelon = new Kuda(watermelon);
        Kuda kudaWithManggo = new Kuda(manggo);
        Kuda kudaWithAvocado = new Kuda(avocado);

        // Demonstrating association
        kudaWithWatermelon.showFavoriteFruit();  // Outputs: Kuda's favorite fruit is: Watermelon
        kudaWithManggo.showFavoriteFruit(); // Outputs: Kuda's favorite fruit is: Manggo
        kudaWithAvocado.showFavoriteFruit(); // Outputs: Kuda's favorite fruit is: Avocado
    }
}
