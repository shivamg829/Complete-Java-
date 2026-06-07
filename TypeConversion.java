public class TypeConversion {
    public static void main(String[] args) {
        int num = 100;
        double doubleNum = num; // Implicit widening conversion
        System.out.println("Integer: " + num);
        System.out.println("Double: " + doubleNum);

        double anotherDouble = 3.14;
        int anotherInt = (int) anotherDouble; // Explicit narrowing conversion
        System.out.println("Double: " + anotherDouble);
        System.out.println("Integer: " + anotherInt);
    }
}
