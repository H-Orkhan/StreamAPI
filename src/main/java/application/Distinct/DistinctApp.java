package application.Distinct;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Deleting repeated elements
public class DistinctApp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 3, 3, 3, 4, 1, 2, 5, 6, 3, 2, 1, 4, 9, 8, 7, 4, 6, 3, 1, 9, 8, 1, 12, 35674, 12494, 1545);
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list.toString());
    }
}
