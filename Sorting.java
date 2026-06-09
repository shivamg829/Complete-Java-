import java.util.*;
public class Sorting {
    public static void main(String[] a){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);

        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        };
        Collections.sort(list, reverseComparator);
        System.out.println(list);

    }
}
