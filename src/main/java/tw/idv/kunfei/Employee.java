package tw.idv.kunfei;

public class Employee {
    private String department;
    private String name;

    public Employee(String department, String name) {
        this.department = department;
        this.name = name;
    }

    // Getter methods
    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    // Setter methods
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }
}
