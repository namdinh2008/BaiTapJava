package SealedClass;

public final class Dog extends Animal {
    @Override
    public void makeSound() {
        bark();
    }

    public void bark() {
        System.out.println("Woof!");
    }
}