// Abstract class: A class that cannot be instantiated and may contain abstract methods (methods without a body). It serves as a blueprint for other classes.

abstract class Vehicle {
    // Abstract method (no body)
    public abstract void start();
    
    // Regular method
    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

// Concrete subclass
class Car extends Vehicle {
    // Implementing abstract method
    public void start() {
        System.out.println("Car engine started");
    }
}

// Another concrete subclass
class Bike extends Vehicle {
    // Implementing abstract method 
    public void start() {
        System.out.println("Bike kick started");
    }
}

// Main class to test
public class AbstractExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        
        myCar.start();  // Output: Car engine started
        myCar.stop();   // Output: Vehicle stopped
        
        myBike.start(); // Output: Bike kick started
        myBike.stop();  // Output: Vehicle stopped
    }
}