// Base class
class Kudera {
    void drive() {
        System.out.println("Driving a vehicle");
    }

    void fuel() {
        System.out.println("Filling fuel");
    }
}

// Derived class
class Sedan extends Kudera {
    @Override
    void drive() {
        System.out.println("Driving a sedan");
    }

    @Override
    void fuel() {
        System.out.println("Filling petrol in sedan");
    }
}

// Another derived class
class SUV extends Kudera {
    @Override
    void drive() {
        System.out.println("Driving an SUV");
    }

    @Override
    void fuel() {
        System.out.println("Filling diesel in SUV");
    }
}

// Another derived class
class ElectricCar extends Kudera {
    @Override
    void drive() {
        System.out.println("Driving an electric car");
    }

    @Override
    void fuel() {
        System.out.println("Charging electric car");
    }
}

// Main class to test inheritance
public class inheritance {
    public static void main(String[] args) {
        // Creating objects of different classes
        Kudera mySedan = new Sedan();
        Kudera mySUV = new SUV();
        Kudera myElectricCar = new ElectricCar();

        // Demonstrating inheritance
        mySedan.drive(); // Outputs: Driving a sedan
        mySedan.fuel();  // Outputs: Filling petrol in sedan

        mySUV.drive();   // Outputs: Driving an SUV
        mySUV.fuel();    // Outputs: Filling diesel in SUV

        myElectricCar.drive(); // Outputs: Driving an electric car
        myElectricCar.fuel();  // Outputs: Charging electric car
    }
}
