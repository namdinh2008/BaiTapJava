
import java.util.Base64;
import java.util.Scanner;

public class AptechJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        System.out.println("Encoded string: " + encoded);

        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded string: " + decoded);

        scanner.close();
    }
}
