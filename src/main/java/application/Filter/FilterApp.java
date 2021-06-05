package application.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterApp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Orxan", "Someone");

        //Using Filter
        //1st we write .stream()
        //2nd we write .filter() in () we write that must be in output or not
        //3rd we can or print names or collect to Collection

        List<String> filteredNames = names
                .stream()
                .filter(name -> !name.equals("Sam"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);

        List<Integer> numbers = Arrays.asList(12, 456, 78, 95, 25, 54863, 5316, 978, 41, 369, 789, 546, 231, 915, 357);

        List<Integer> oddNumbers = numbers.stream()
                .filter(integer -> integer % 2 != 0)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("All numbers: " + numbers + " Count = " + numbers.size());
        System.out.println("Odd numbers: " + oddNumbers + " Count = " + oddNumbers.size());
        System.out.println("Even numbers: " + evenNumbers + " Count = " + evenNumbers.size());
    }
}
