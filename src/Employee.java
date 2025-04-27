import java.util.List;

public final class Employee {

    private int id;
    private String employeeName;
    private List<String> contacts;

    public Employee(int id, String employeeName, List<String> contacts) {
        this.id = id;
        this.employeeName = employeeName;
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public List<String> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
