import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        System.out.println(list);
        list.remove("World");
        System.out.println(list);
        list.set(0, "Hi");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.add("New");
        System.out.println(list);
    }
}
