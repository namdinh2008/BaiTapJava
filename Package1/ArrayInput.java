import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.print("Array: { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.print(" }");

    }
}
