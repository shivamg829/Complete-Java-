class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
public class Class {
   public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(5, 10);
        System.out.println("The sum is: " + sum); // The sum is: 15
    }
}
