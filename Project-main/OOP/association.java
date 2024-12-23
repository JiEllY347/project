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

// Class representing Gerald
class Gerald {
    private Fruit favoriteFruit;

    // Constructor
    public Gerald(Fruit favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }

    // Method to get the favorite fruit
    public void showFavoriteFruit() {
        System.out.println("Gerald's favorite fruit is: " + favoriteFruit.getName());
    }
}

// Main class to test association
public class association {
    public static void main(String[] args) {
        // Creating Fruit objects
        Fruit apple = new Fruit("Apple");
        Fruit banana = new Fruit("Banana");
        Fruit orange = new Fruit("Orange");

        // Creating Gerald object with an associated favorite fruit
        Gerald geraldWithApple = new Gerald(apple);
        Gerald geraldWithBanana = new Gerald(banana);
        Gerald geraldWithOrange = new Gerald(orange);

        // Demonstrating association
        geraldWithApple.showFavoriteFruit();  // Outputs: Gerald's favorite fruit is: Apple
        geraldWithBanana.showFavoriteFruit(); // Outputs: Gerald's favorite fruit is: Banana
        geraldWithOrange.showFavoriteFruit(); // Outputs: Gerald's favorite fruit is: Orange
    }
}
