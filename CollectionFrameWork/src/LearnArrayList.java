import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
//
//        ArrayList<String> studentsName = new ArrayList<>();
//        studentName.add("Ridhika");
//        System.out.println(studentName);

        //Create a List
//        List<Integer> list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list);
//        list.add(5);
//        System.out.println(list);
//        list.add(1,25);
//        System.out.println(list);
//        //Add newList
//        List<Integer> newList = new ArrayList();
//        newList.add(150);
//        newList.add(160);
//        list.addAll(newList);
//        System.out.println(list);
//        System.out.println(list.get(1));

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);
        for (int i =0; i< list.size(); i++){
            System.out.println("the element is " + list.get(i));
        }
        for (Integer element: list){
            System.out.println("foreach element is " + element);
        }

//        Iterator<Integer> it = list.iterator();
//        while(it.hasNext()) {
//            System.out.println("iterator " + it.next());
//        }




        //Change element
//        list.set(2, 100);
//        System.out.println(list);
//
//        //Element Present or NOT
//        System.out.println(list.contains(50));


//        //Remove Element
//        list.remove(3);
//        System.out.println(list);
//
//
//        list.remove(Integer.valueOf(30));
//        System.out.println(list);
//
//        //Remove all the elements
//        list.clear();
//        System.out.println(list);

    }

}
