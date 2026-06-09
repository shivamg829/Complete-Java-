@FunctionalInterface
interface A {
    void myMethod();
}
// class B implements A {
//     public void myMethod() {
//         System.out.println("This is a functional interface example.");
//     } 
// }
public class FunctionalInterfaceExa {
    public static void main(String[] args) {
        // A obj = new B();

        // Anonymous class implementation of the functional interface
        // A obj = new A(){
        //     public void myMethod() {
        //         System.out.println("This is a functional interface example.");
        //     }
        // };

        // Lambda expression implementation of the functional interface
        A obj = () -> System.out.println("This is a functional interface example."); 
        obj.myMethod();
    }
    
}
