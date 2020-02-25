package application.anyMatch;

import java.util.Arrays;
import java.util.List;

//finding that expression in scope (true or false)
public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 9, 5, 3, 4, 7, 2, 6, 9, 8, 7, 4, 1, 2, 3, 6, 5, 4);
        boolean first = integerList
                .stream()
                .anyMatch(integer -> integer % 2 == 0);
        System.out.println(first);
    }
}
