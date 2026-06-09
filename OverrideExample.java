// Overriding is runtime polymorphism where a subclass provides a specific implementation of a method that is already defined in its superclass.
class Parent {
    void show() {
        System.out.println("Parent's show method");
    }
}
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's show method");
    }
}

public class OverrideExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.show(); // Output: Child's show method
    }
}
