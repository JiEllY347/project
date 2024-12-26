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

// Class representing AbaoKudera
class AbaoKudera {
    private String groupName;
    private Person leader;

    // Constructor
    public AbaoKudera(String groupName, Person leader) {
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
        Person abao = new Person("Abaooooo");
        Person kudera = new Person("Kuderaaaaaa");
        Person felicano = new Person("Felicanooooo");

        // Creating Bonalos objects with the associated leader
        AbaoKudera group1 = new AbaoKudera("Group Z", abao);
        AbaoKudera group2 = new AbaoKudera("Group Y", kudera);
        AbaoKudera group3 = new AbaoKudera("Group X", felicano);

        // Demonstrating aggregation
        group1.showGroupInfo(); // Outputs: Group Z has the leader: John
        group2.showGroupInfo(); // Outputs: Group Y has the leader: Mary
        group3.showGroupInfo(); // Outputs: Group X has the leader: Alice
    }
}