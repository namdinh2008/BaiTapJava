import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello, World!");

        if (optionalValue.isPresent()) {
            System.out.println("Value is present.");
        } else {
            System.out.println("Value is not present.");
        }

        String value = optionalValue.get();
        System.out.println("Value: " + value);

        Optional<String> emptyOptional = Optional.empty();
        String defaultValue = emptyOptional.orElse("Default Value");
        System.out.println("Defaulted value: " + defaultValue);
    }
}
