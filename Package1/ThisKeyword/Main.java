package ThisKeyword;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 500);

        System.out.println("Product 1: " + product1.name + ", Price: $" + product1.price);
        System.out.println("Product 2: " + product2.name + ", Price: $" + product2.price);
    }
}
