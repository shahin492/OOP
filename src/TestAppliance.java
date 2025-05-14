// Interface: defines operational behavior that all appliances must implement
interface Operable {
    void turnOn();   // Method to turn on the appliance
    void turnOff();  // Method to turn off the appliance
}

// Abstract class: base class for all appliances
abstract class Appliance {
    String brand;   // Common attribute for all appliances
    String model;

    // Constructor: sets brand and model
    public Appliance(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Abstract method: must be implemented by all subclasses
    abstract void operate();

    // Concrete method: shared behavior for all appliances
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

// Subclass: WashingMachine inherits from Appliance and implements Operable interface
class WashingMachine extends Appliance implements Operable {

    public WashingMachine(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Washing machine turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing machine turned off.");
    }

    @Override
    void operate() {
        System.out.println("Washing clothes.");
    }
}

// Subclass: Microwave inherits from Appliance and implements Operable interface
class Microwave extends Appliance implements Operable {

    public Microwave(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Microwave turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Microwave turned off.");
    }

    @Override
    void operate() {
        System.out.println("Heating food.");
    }
}

// Main class: entry point of the program
public class TestAppliance {
    public static void main(String[] args) {

        // Create a WashingMachine object using Appliance reference
        Appliance wm = new WashingMachine("LG", "T70SJMB1Z");
        wm.displayInfo();
        ((Operable) wm).turnOn();
        wm.operate();
        ((Operable) wm).turnOff();

        System.out.println();

        // Create a Microwave object using Appliance reference
        Appliance mw = new Microwave("Samsung", "MS23K3513AK");
        mw.displayInfo();
        ((Operable) mw).turnOn();
        mw.operate();
        ((Operable) mw).turnOff();
    }
}
