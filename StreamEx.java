import java.util.*;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Example 1: Filter even numbers
        List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Example 2: Multiply each number by 2
        List<Integer> doubledNumbers = list.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Doubled numbers: " + doubledNumbers);

        // Example 3: Sum of all numbers
        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // Example 4: Sort in descending order
        List<Integer> sortedDesc = list.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        System.out.println("Sorted descending: " + sortedDesc);
    }
}