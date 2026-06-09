public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer b = Integer.valueOf(a); // Boxing
        int c = b.intValue(); // Unboxing

        System.out.println("Primitive int: " + a);
        System.out.println("Wrapper Integer: " + b);
        System.out.println("Unboxed int: " + c);

        double x = 5.5;
        Double y = Double.valueOf(x); // Boxing
        double z = y.doubleValue(); // Unboxing
        System.out.println("Primitive double: " + x);
        System.out.println("Wrapper Double: " + y);
        System.out.println("Unboxed double: " + z);

        float m = 3.14f;
        Float n = m; // Autoboxing
        float o = n; // Auto-unboxing
        System.out.println("Primitive float: " + m);
        System.out.println("Wrapper Float: " + n);
        System.out.println("Unboxed float: " + o);

    }
}
