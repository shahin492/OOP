abstract class Vehicle {
    abstract void startEngine();

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

 class Car1 extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine started.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Vehicle car1 = new Car1();
        Vehicle bike = new Bike();

        car1.startEngine();
        car1.stopEngine();

        bike.startEngine();
        bike.stopEngine();
    }
}
