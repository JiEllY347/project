// Class representing a Person
class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter for the name
    public String getName() {
        return name;
    }
}

// Class representing Bonalos
class Bonalos {
    private String groupName;
    private Person leader;

    // Constructor
    public Bonalos(String groupName, Person leader) {
        this.groupName = groupName;
        this.leader = leader;
    }

    // Method to show the group information
    public void showGroupInfo() {
        System.out.println(groupName + " has the leader: " + leader.getName());
    }
}

// Main class to test aggregation
public class aggregation {
    public static void main(String[] args) {
        // Creating Person objects
        Person ode = new Person("Odeeeeee");
        Person kudera = new Person("Kuderaaaaaa");
        Person bonalos = new Person("Bonalosssss");

        // Creating Bonalos objects with the associated leader
        Bonalos group1 = new Bonalos("Group A", ode);
        Bonalos group2 = new Bonalos("Group B", kudera);
        Bonalos group3 = new Bonalos("Group C", bonalos);

        // Demonstrating aggregation
        group1.showGroupInfo(); // Outputs: Group A has the leader: John
        group2.showGroupInfo(); // Outputs: Group B has the leader: Mary
        group3.showGroupInfo(); // Outputs: Group C has the leader: Alice
    }
}
