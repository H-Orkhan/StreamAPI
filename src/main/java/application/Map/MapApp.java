package application.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//We are using map to create new Objects by
//Or for changing all numbers from List

public class MapApp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Orxan", "Someone");
        List<User> userList = names.stream().filter(name -> !name.equals("Sam")).map(User::new).collect(Collectors.toList());
        System.out.println(userList);

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        integers.stream().filter(integer -> integer%2==0).map(integer -> integer*2).forEach(System.out::println);

        List<Character> letters = Arrays.asList('a','B','c','d','E','f','g');

        letters =letters.stream().peek(Character::isLowerCase).map(Character::toUpperCase).collect(Collectors.toList());
        System.out.println(letters);

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> notChange = integerList.stream().filter(integer -> integer %2 !=0).collect(Collectors.toList());
        List<Integer> change = integerList.stream().filter(integer -> integer %2 == 0).map(integer -> integer*2).collect(Collectors.toList());
        List<Integer> total = new ArrayList<>();
        total.addAll(change); total.addAll(notChange);
        total = total.stream().sorted().collect(Collectors.toList());
        System.out.println(total);

    }
}
