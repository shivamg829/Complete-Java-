
public class Exceptions {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            a /= b;
            if(b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero!");
            }
        } catch (ArithmeticException e) {
            a /= 1;
            System.out.println("This is default output" + e);
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

// Throw and Throws
// The throw keyword is used to explicitly throw an exception from a method or block of code. It is typically used when you want to signal that an error has occurred and provide information about the error. For example:
// public void someMethod() {
//     if (someCondition) {
//         throw new IllegalArgumentException("Invalid argument!");
//     }
// }
// The throws keyword is used in a method signature to declare that the method may throw one or more exceptions. It indicates that the caller of the method should be prepared to handle these exceptions. For example:
// public void someMethod() throws IOException {
//     // Code that may throw an IOException
// }
