class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
class GoldenRetriever extends Dog {
    void meow() {
        System.out.println("Meowing...");
    }
}
class Inheritence {
    public static void main(String[] args) {
        GoldenRetriever goldenRetriever = new GoldenRetriever();
        goldenRetriever.eat();
        goldenRetriever.bark();
        goldenRetriever.meow();
    }
}