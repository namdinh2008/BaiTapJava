public class TypeCasting {
    public static void main(String[] args) {
        double doubleValue = 5.75;
        System.out.println("Double value: " + doubleValue);

        int intValue = (int) doubleValue;
        System.out.println("Converted to int: " + intValue);

        // Converting back to double
        double convertedBack = intValue;
        System.out.println("Converted back to double: " + convertedBack);
    }
}
