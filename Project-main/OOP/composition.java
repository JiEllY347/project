// Class representing an Employee
class Employee {
    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Getter for the name
    public String getName() {
        return name;
    }
}

// Class representing a Company
class Company {
    private String companyName;
    private Employee employee;

    // Constructor: A company is created with an employee, which cannot exist without the company
    public Company(String companyName, String employeeName) {
        this.companyName = companyName;
        this.employee = new Employee(employeeName);
    }

    
    public void showCompanyInfo() {
        System.out.println(companyName + " has employee: " + employee.getName());
    }
}


public class composition {
    public static void main(String[] args) {
        // Creating a Company object
        Company company1 = new Company("TechCorp", "Marvin Bonalos");
        Company company2 = new Company("Innovate", "Bini Colet");

        // Demonstrating composition
        company1.showCompanyInfo(); 
        company2.showCompanyInfo(); 
    }
}
