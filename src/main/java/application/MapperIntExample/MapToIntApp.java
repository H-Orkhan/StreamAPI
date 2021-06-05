package application.MapperIntExample;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

//MapToInt is using to collect all int values from stream and can do a lot of things with it such a

public class MapToIntApp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Orxan", "Someone");

        List<User> userList = names.stream().filter(name -> name.equals("Sam")).map(User::new).collect(Collectors.toList());
        System.out.println(userList.toString());

        int sumAge = userList.stream().mapToInt(User::getAge).sum();

        System.out.println(sumAge);

        OptionalDouble averageAge = (userList.stream().mapToInt(User::getAge).average());

        System.out.println(averageAge);
    }

    private static boolean test(String name) {
        return !name.equals("Sam");
    }
}
