package SealedClass;

public sealed class Animal permits Dog, Cat {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}