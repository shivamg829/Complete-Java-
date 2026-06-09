// Upcasting and Downcasting in Java
// Upcasting is the process of converting a subclass reference to a superclass reference. It is done implicitly and does not require explicit casting. Downcasting, on the other hand, is the process of converting a superclass reference back to a subclass reference. It requires explicit casting and can lead to a ClassCastException if the object being downcasted is not an instance of the subclass.
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
public class UpcastingDowncasting {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.eat(); 
        Dog myDog = (Dog) myAnimal; // Downcasting
        myDog.bark(); 
    }
}
