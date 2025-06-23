package ContructorOverloading;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Ven man bi mat", 0.6);
        Book book2 = new Book();
        System.out.println("Book 1: " + book1.title + ", Price: $" + book1.price);
        System.out.println("Book 2: " + book2.title + ", Price: $" + book2.price);
    }
}
