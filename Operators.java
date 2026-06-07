public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b)); // 30
        System.out.println("Subtraction: " + (a - b)); // -10
        System.out.println("Multiplication: " + (a * b)); // 200
        System.out.println("Division: " + (b / a)); // 2
        System.out.println("Modulus: " + (b % a)); // 0

        // Relational Operators
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false

        // Assignment Operators
        int c = a; // c is now 10
        c += 5; // c is now 15
        c -= 3; // c is now 12
        c *= 2; // c is now 24
        c /= 4; // c is now 6
        c %= 4; // c is now 2

        System.out.println("Final value of c: " + c); // 2
    }
}
