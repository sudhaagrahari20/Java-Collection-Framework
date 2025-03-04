import java.util.*;
class Student implements Comparable<Student>{
    int id;
    String name;
    int marks;
    
    public Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    // Implementing the compareTo method
    @Override
    public int compareTo(Student other){
        return this.marks - other.marks;
    }
    
    @Override
    public String toString(){
        return id + " - " + name + " - " + marks; 
    }
}

public class Main{
    public static void main(String[] args){
        List<Student> s = new ArrayList<>();
        s.add(new Student(1, "Ankit", 89));
        s.add(new Student(2, "Ram", 75));
        s.add(new Student(3, "Priya", 64));
        s.add(new Student(4, "Bob", 92));
        
        Collections.sort(s); // Sorting using Comparable
        for(Student s1 : s){
            System.out.println(s1);
        }
                
    }
}
