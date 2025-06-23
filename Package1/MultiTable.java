import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table(1-10): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("Invalid input! Please enter a number between 1 and 10.");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

        scanner.close();
    }
}
