interface Walkable {
    void walk();
}

interface Barkable {
    void bark();
}

class RobotDog implements Walkable, Barkable {
    public void walk() {
        System.out.println("RobotDog is walking...");
    }

    public void bark() {
        System.out.println("RobotDog is barking...");
    }
}

public class MultipleInheritanceusingInterface {
    public static void main(String[] args) {
        RobotDog robo = new RobotDog();
        robo.walk();
        robo.bark();
    }
}
