public class Constructor {
    // Default constructor
    public Constructor() {
        System.out.println("Constructor called");
    }
    // Parameterized constructor
    public Constructor(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor();
        Constructor obj2 = new Constructor("Hello, World!");
    }
}
