import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {

        Rating rB = new Rating(1, Year.now(),'B');
        Rating rA = new Rating(1, Year.now(),'A');
        Rating rC = new Rating(1, Year.now(),'C');
        Rating rA_2024 = new Rating(2, Year.now().minusYears(1L),'A');
        Rating rA_2023 = new Rating(3, Year.now().minusYears(2L),'A');

        Employee e = new Employee(1,"aamir", List.of("2345","1234"),List.of(rA));
        Employee e2 = new Employee(2,"suresh", List.of("2345","1234"),List.of(rB,rA_2023,rA_2024));
        List<Employee> empList = new ArrayList<>();
        empList.add(e);
        empList.add(e2);

        //Use streams and print the employees having rating A current year
        /*empList.stream()
                .filter(emp -> emp.getRatings()
                        .stream()
                        .anyMatch(rating -> Year.now().equals(rating.getYear()) && rating.getRating() == 'A'))
                .forEach(emp -> System.out.println(emp));*/

        //To find the duplicates in the stream and count each duplicates

        Stream<Integer> integerStream = Stream.of(1,2,3,4,2,2,6,7,7);

        /*integerStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).forEach( (k,v) ->
                System.out.println("number -> "+ k + " count -> "+ v));*/

        //This will print duplicate elements without parsing the collection twice.
        Set<Integer> alreadyAdded = new HashSet<>();
        Set<Integer> duplicates = integerStream.filter( num -> !alreadyAdded.add(num))
                .collect(Collectors.toSet());
        //System.out.println(duplicates);

        //checking immutability exercise
        Address s1 = new Address(1,"C 101", "Aditya Society","sector 78", "Noida", "India");
        Student s = new Student(1,"aamir kamaal", s1);

        Address s2 = new Address(2, "E 405", "Aditya society", "sector78", "Noida", "India");
        s1 = s2;

        System.out.println(s1);






    }
}