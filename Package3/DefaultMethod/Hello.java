package DefaultMethod;

public interface Hello {
    default void greet() {
        System.out.println("Default greeting!");
    }
}
