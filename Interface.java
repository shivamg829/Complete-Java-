// We can not create an object of an interface, but we can create a reference variable of an interface type that points to an object of a class that implements the interface. This allows us to use the methods defined in the interface through the reference variable, while the actual implementation is provided by the class that implements the interface.
interface MyInterface {
    void myMethod();
    void anotherMethod();
    // Static and final
    int myVariable = 10; // This is a static and final variable, it cannot be changed.

}
class MyClass implements MyInterface {
    public void myMethod() {
        System.out.println("Hello from MyClass!");
    }
    public void anotherMethod() {
        System.out.println("Hello from anotherMethod!");
    }
}
public class Interface {
    public static void main(String[] args) {
        MyInterface myObject = new MyClass();
        myObject.myMethod();
        myObject.anotherMethod();
        System.out.println("Value of myVariable: " + MyInterface.myVariable);
    }
}
