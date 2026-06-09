public class InnerClassExample {
    private String outerField = "Outer Field";

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("Accessing: " + outerField);
        }
    }

    public static void main(String[] args) {
        InnerClassExample outer = new InnerClassExample();
        InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
