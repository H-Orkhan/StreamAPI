package application.FlatMap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//MapToInt is using to collect all int values from stream and can do a lot of things with it such a

public class flatMapApp {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Orxan", 20, Arrays.asList("1", "2")),
                new User("Someone", 25, Arrays.asList("5", "9", "13")),
                new User("One", 46, Arrays.asList("7", "3", "456", "789")));

        Optional<String> stringOptional = users.stream()
                .map(User::getPhoneNumbers)
                .flatMap(strings -> strings.stream().filter(phoneNo -> phoneNo.equals("5"))).findAny();

        List<Integer> PrimeNumbers = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8, 10);
        List<List<Integer>> megaList = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
        System.out.println(megaList);
        List<Integer> listInt = megaList.stream().flatMap(integers -> integers.stream()).collect(Collectors.toList());
        System.out.println(listInt);
    }

    private static boolean test(String name) {
        return !name.equals("Sam");
    }

    private static Stream<?> apply(List<String> strings) {
        return strings.stream().filter(phone -> phone.equals("5"));
    }
}
