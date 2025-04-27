import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequentAccessUsers {

    public static void main(String[] args) {

        /**
         * Given list of users accessing some portal frequently
         * Input will me list of Integers which holds the userIds of users accessing the portal
         * We have to find the top K users arranged in decreasing order of number of times an accessed user.
         */

        List<Integer> userAccessList = new ArrayList<>();
        userAccessList.addAll(List.of(1,2,2,3,1,4,5,6,7,3,3,4,7,8,9,3,7,4,1,1,1));

        int topNUsers = 5;

        System.out.println(getFrequencyOfTopKUsers(userAccessList, topNUsers));
    }

    public static List<Integer> getFrequencyOfTopKUsers(List<Integer> userIdList, int K) {

        Map<Integer, Long> userAccessCount = new HashMap<>();
        userAccessCount = userIdList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(userAccessCount);

        Comparator<Map.Entry<Integer,Long>> entrySetComparator =
                (e1, e2) -> e1.getValue() > e2.getValue() ? -1 : 1;

        List<Integer> sortedList = userAccessCount
                .entrySet()
                .stream()
                .sorted(entrySetComparator)
                .limit(K)
                .map(entry -> entry.getKey())
                .toList();


        return sortedList;
    }
}
