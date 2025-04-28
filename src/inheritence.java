class Alamin{
    protected String type = "Animal";

    void display() {
        System.out.println("This is an animal.");
    }
}

class Dog1 extends Alamin {
    void bark() {
        System.out.println(type + " says Woof!");
    }
}

public class inheritence {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.display();
        d.bark();
    }
}