// Base class
class Kudera {
    void drive() {
        System.out.println("Driving a Jeep");
    }

    void fuel() {
        System.out.println("Filling fuel");
    }
}

// Derived class
class BigBike extends Kudera {
    @Override
    void drive() {
        System.out.println("Driving a BigBike");
    }

    @Override
    void fuel() {
        System.out.println("Filling petrol in BigBike");
    }
}

// Another derived class
class Bicycle extends Kudera {
    @Override
    void drive() {
        System.out.println("Driving an Bicycle");
    }

    @Override
    void fuel() {
        System.out.println("Changing wheels");
    }
}

// Another derived class
class ElectricMotor extends Kudera {
    @Override
    void drive() {
        System.out.println("Driving an electric motor");
    }

    @Override
    void fuel() {
        System.out.println("Charging electric motor");
    }
}

// Main class to test inheritance
public class inheritance {
    public static void main(String[] args) {
        // Creating objects of different classes
        Kudera myBigBike = new BigBike();
        Kudera myBicycle = new Bicycle();
        Kudera myElectricMotor = new ElectricMotor();

        // Demonstrating inheritance
        myBigBike.drive(); // Outputs: Driving a BigBike
        myBigBike.fuel();  // Outputs: Filling petrol in BigBike

        myBicycle.drive();   // Outputs: Driving an Bycicle
        myBicycle.fuel();    // Outputs: Changing wheels

        myElectricMotor.drive(); // Outputs: Driving an electric Motor
        myElectricMotor.fuel();  // Outputs: Charging electric Motor
    }
}
