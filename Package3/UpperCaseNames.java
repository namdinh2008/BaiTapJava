import java.util.*;
import java.util.stream.Collectors;

public class UpperCaseNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of names
        System.out.print("Enter number of names: ");
        int n = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();

        // Step 2: Input names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names.add(scanner.nextLine());
        }

        // Step 3: Convert to uppercase and add quotes
        String result = names.stream()
                .map(String::toUpperCase)
                .map(name -> "\"" + name + "\"")
                .collect(Collectors.joining(", ", "[", "]"));

        // Step 4: Print the result
        System.out.println("Output: " + result);

        scanner.close();
    }
}
