import java.time.Year;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rating rB = new Rating(1, Year.now(),'B');
        Rating rA = new Rating(1, Year.now(),'A');
        Rating rC = new Rating(1, Year.now(),'C');
        Rating rA_2024 = new Rating(2, Year.now().minusYears(1L),'A');
        Rating rA_2023 = new Rating(3, Year.now().minusYears(2L),'A');

        Employee e = new Employee(1,"aamir", List.of("2345","1234"),List.of(rA,rA_2023,rA_2024));
        Employee e2 = new Employee(2,"suresh", List.of("2345","1234"),List.of(rB,rA_2023,rA_2024));

        List<Employee> empList = new ArrayList<>();
        empList.add(e);
        empList.add(e2);

        //Use streams and print the employees having rating A current year
        empList.stream()
                .filter(emp -> emp.getRatings()
                        .stream()
                        .anyMatch(rating -> Year.now().equals(rating.getYear()) && rating.getRating() == 'A'))
                .forEach(emp -> System.out.println(emp));





    }
}