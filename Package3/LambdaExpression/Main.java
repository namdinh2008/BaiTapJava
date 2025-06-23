package LambdaExpression;

public class Main {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Printable interface
        Printable printable = () -> System.out.println("Hello, Lambda Expressions!");

        // Calling the print method
        printable.print();
    }
}
