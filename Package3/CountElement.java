import java.util.Arrays;
import java.util.List;

public class CountElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        long count = numbers.stream().filter(n -> n > 50).count();
        System.out.println("Count of elements greater than 50: " + count);
    }
}
