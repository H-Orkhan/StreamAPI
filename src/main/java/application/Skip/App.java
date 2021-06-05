package application.Skip;

import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 9, 5, 3, 4, 7, 2, 6, 9, 8, 7, 4, 1, 2, 3, 6, 5, 4);
        int first = integerList.stream()
                .filter(integer -> integer % 2 != 0)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(first);
    }
}
