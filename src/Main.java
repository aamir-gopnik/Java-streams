import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {

        Employee e = new Employee(1,"aamir", List.of("2345","1234"));
        Employee e2 = new Employee(2,"suresh", List.of("2345","1234"));
        List<Employee> empList = new ArrayList<>();

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
    }
}