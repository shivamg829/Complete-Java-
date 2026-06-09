import java.util.HashMap;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Hello", 1);
        map.put("World", 2);
        map.put("Hello", 3);
        System.out.println(map);
        System.out.println(map.get("Hello"));
        System.out.println(map.get("World"));
        map.remove("Hello");
        System.out.println(map);
        map.clear();
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
