import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(5);
        list.add(86);
        list.add(67);
        list.add(9);

        System.out.println("min element "+ Collections.min(list));
        System.out.println("max element "+ Collections.max(list));
        System.out.println(Collections.frequency(list, 9));
        Collections.sort(list);
        System.out.println(list);


    }
}
