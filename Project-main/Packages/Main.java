package Packages;
// Import the Employee class from the mycar package
import mycar.Employee;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Employee from the mycar package
        Employee emp = new Employee("Bonalos");

        // Call the method to display employee information
        emp.displayInfo();
    }
}
