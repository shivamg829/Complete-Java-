// Final can use with variables, methods, and classes in Java. You can not change the value of a final variable, override a final method, or extend a final class.
public class FinalKeyword {
    public static void main(String[] args) {
        final int x = 10;
        // x = 20; // This will cause a compile-time error because x is final

        final String name = "John";
        // name = "Doe"; // This will also cause a compile-time error because name is final

        System.out.println("Value of x: " + x);
        System.out.println("Value of name: " + name);
    }
}
