package LambdaAddition;

public class Main {
    public static void main(String[] args) {
        Addle a = (x, y) -> x + y;
        System.out.println(a.add(3, 5));
    }
}
