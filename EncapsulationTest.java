class Encapsulation {
    // Encapsulation is the process of wrapping data (variables) and code (methods) together as a single unit.
    // In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. This is known as data hiding.
    private String name;
    private int age;

    public Encapsulation() {
        // Default constructor
        System.out.println("Encapsulation object created.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}
class EncapsulationTest {
    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        person.setName("John");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
