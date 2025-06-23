import java.util.Scanner;

public class StringManipulate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("The first character: " + name.charAt(0));
        System.out.println("String length: " + name.length());

        scanner.close();

    }
}
