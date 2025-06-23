package ContructorOverloading;

public class Book {
    public String title;
    public double price;

    public Book() {
        this.title = "Unknown Title";
        this.price = 0.0;
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
}
