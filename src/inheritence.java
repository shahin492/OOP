class Vehicle2 {
    protected String brand = "Generic Vehicle";

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car5 extends Vehicle2 {
    void drive() {
        System.out.println(brand + " is driving...");
    }
}

public class inheritence{
    public static void main(String[] args) {
        Car5 myCar = new Car5();
        myCar.start();   // Method from Vehicle
        myCar.drive();   // Method from Car
    }
}
