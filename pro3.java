//Java program code for method overloading and overriding. take the example classes which your needed to implement it.
class Animal {
    // Method Overriding
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
    public void makeSound(int numTimes) {
        for (int i = 0; i < numTimes; i++) {
            System.out.println("Woof");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound(3);
    }
}
