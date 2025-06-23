package MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();

        int sum1 = calculate.add(5, 10);
        System.out.println("Method 1: " + sum1);

        double sum2 = calculate.add(5.5, 10.5);
        System.out.println("Method 2: " + sum2);

        int sum3 = calculate.add(1, 2, 3);
        System.out.println("Method 3: " + sum3);
    }
}
