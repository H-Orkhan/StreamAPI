package application.min;

import java.util.Arrays;
import java.util.List;

//finding min
public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(9, 5, 3, 4, 7, 2, 6, 9, 8, 7, 4, 1, 2, 3, 6, 5, 4);
        Integer first = integerList.stream().min(Integer::compareTo).get();
        System.out.println(first);
    }
}
