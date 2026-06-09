// Demonstrating Polymorphism in Java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Output: Woof!

        animal = new Cat();
        animal.makeSound(); // Output: Meow!
    }
}
