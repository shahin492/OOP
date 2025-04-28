abstract class Animal1 {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal1 {
    void makeSound() {
        System.out.println("Bark Bark");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.sleep();
    }
}