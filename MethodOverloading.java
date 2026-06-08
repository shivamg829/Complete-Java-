class Calculator {
    // Method overloading: same method name, different parameters
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverloading {
   public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum2 = calc.add(5, 10);
        System.out.println("The sum is: " + sum2); // The sum is: 15
        int sum3 = calc.add(5, 10, 15);
        System.out.println("The sum of three numbers is: " + sum3); // The sum of three numbers is: 30
        double sumDouble = calc.add(5.5, 10.5);
        System.out.println("The sum of doubles is: " + sumDouble); // The sum of doubles is: 16.0
    }
}
