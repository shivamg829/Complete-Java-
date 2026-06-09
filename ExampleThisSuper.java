// Super and this keywords in Java
// Super is used to refer to the immediate parent class object. It can be used to access parent class methods and variables.
// This is used to refer to the current class object. It can be used to access current class methods and variables.
class Parent {
    int value = 10;
    
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    int value = 20;
    
    void show() {
        System.out.println("this.value = " + this.value);
        System.out.println("super.value = " + super.value);
        
        this.display();
        super.show();
    }
    
    void display() {
        System.out.println("Child display");
    }
}

public class ExampleThisSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}