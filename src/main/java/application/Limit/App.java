package application.Limit;

import java.util.Arrays;
import java.util.List;

//Limit is used for giving limit ti stream
public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 9, 5, 3, 4, 7, 2, 6, 9, 8, 7, 4, 1, 2, 3, 6, 5, 4);
        integerList.stream().filter(integer -> integer % 2 != 0).skip(1).skip(1).limit(2).forEach(System.out::println);

    }
}
