import java.util.HashSet;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("World");
        set.add("World");
        set.add("World");
        set.add("Hello");
        set.add("Hello");
        System.out.println(set);
        set.remove("Hello");
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
