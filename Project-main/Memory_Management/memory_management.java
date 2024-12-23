package Memory_Management;

public class memory_management {

    // Class to represent an object (allocated in heap memory)
    static class Person {
        String name;
        int age;

        // Constructor to initialize a new person object
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display object details
        public void display() {
            System.out.println("Person{name='" + name + "', age=" + age + "}");
        }
    }

    public static void main(String[] args) {
        // Memory Allocation
        Person person1 = new Person("Marvin", 21);
        Person person2 = new Person("Bonalos", 20);

        // Displaying object details
        person1.display();
        person2.display();

        // Memory De-allocation: Dereferencing the objects
        person1 = null;  
        person2 = null;  

        
        System.gc();  

        // Output a message
        System.out.println("End of the program. Objects are eligible for garbage collection.");
    }

    // Overriding finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("An object is being garbage collected!");
        super.finalize();
    }
}
