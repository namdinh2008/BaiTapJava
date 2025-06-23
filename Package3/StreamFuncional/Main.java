package StreamFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        Checker even = n -> n % 2 == 0;

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> even.check(n))
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }
}
