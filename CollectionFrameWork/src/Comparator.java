import java.util.*;
class Student{
    int id;
    String name;
    int marks;
    
    public Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
        
    @Override
    public String toString(){
        return id + " - " + name + " - " + marks; 
    }
}

//Comparator for sorting by name
class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

public class Main{
    public static void main(String[] args){
        List<Student> s = new ArrayList<>();
        s.add(new Student(1, "Ankit", 89));
        s.add(new Student(2, "Ram", 75));
        s.add(new Student(3, "Priya", 64));
        s.add(new Student(4, "Bob", 92));
        
        Collections.sort(s, new SortByName()); // Sorting using Comparable
        for(Student s1 : s){
            System.out.println(s1);
        }        
    }
}
