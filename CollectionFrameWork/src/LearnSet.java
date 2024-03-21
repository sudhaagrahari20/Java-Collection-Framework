import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
//      Set<Integer> set = new HashSet<>();
//      Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(32);
        set.add(5);
        set.add(45);
        set.add(21);
        set.add(65);
        System.out.println(set);

        set.remove(21);
        System.out.println(set);

        //Element present or Not
        System.out.println(set.contains(65));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
