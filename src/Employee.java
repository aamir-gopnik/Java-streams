import java.util.List;

public final class Employee {

    private int id;
    private String employeeName;
    private List<String> contacts;
    private List<Rating> ratings;

    public Employee(int id, String employeeName, List<String> contacts, List<Rating> ratings) {
        this.id = id;
        this.employeeName = employeeName;
        this.contacts = contacts;
        this.ratings = ratings;
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

    public List<Rating> getRatings() {
        return ratings;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", contacts=" + contacts +
                ", ratings=" + ratings +
                '}';
    }

}
