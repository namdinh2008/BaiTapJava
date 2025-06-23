package SealedClass;

public final class Cat extends Animal {
    @Override
    public void makeSound() {
        meow();
    }

    public void meow() {
        System.out.println("Meow!");
    }
}
