package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serializable class
class Person implements Serializable {
    private static final long serialVersionUID = 1L;  // A unique version identifier for the class
    
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display object details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Serialization {

    // Serialization: Saving object state to a file
    public static void serializeObject(Person person) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);  // Serialize object to file
            System.out.println("Serialization successful: Person object saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialization: Restoring object state from a file
    public static Person deserializeObject() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person person = (Person) in.readObject();  // Deserialize object from file
            System.out.println("Deserialization successful: Person object restored.");
            return person;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("John Doe", 30);
        
        // Serialize the object
        serializeObject(person1);

        // Deserialize the object
        Person deserializedPerson = deserializeObject();
        
        // Display deserialized object details
        if (deserializedPerson != null) {
            deserializedPerson.display();
        }
    }
}
