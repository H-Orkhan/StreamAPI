package application.Count;

import java.util.Arrays;
import java.util.List;

//count to counting numbers of stream
public class App {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 9, 5, 3, 4, 7, 2, 6, 9, 8, 7, 4, 1, 2, 3, 6, 5, 4);
        long first = integerList.
                stream().
                count();
        System.out.println(first);
    }
}
