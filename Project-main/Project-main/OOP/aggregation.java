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

// Class representing AngeJel
class AngeJel {
    private String groupName;
    private Person leader;

    // Constructor
    public AngeJel(String groupName, Person leader) {
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
        Person Jielly = new Person("Jielly");
        Person Angel = new Person("Angel");
        Person Felicano = new Person("Felicano");

        // Creating Bonalos objects with the associated leader
        AngeJel group1 = new AngeJel("Group Z", Jielly);
        AngeJel group2 = new AngeJel("Group X", Angel);
        AngeJel group3 = new AngeJel("Group Y", Felicano);

        // Demonstrating aggregation
        group1.showGroupInfo(); // Outputs: Group Z has the leader: John
        group2.showGroupInfo(); // Outputs: Group X has the leader: Mary
        group3.showGroupInfo(); // Outputs: Group Y has the leader: Alice
    }
}
