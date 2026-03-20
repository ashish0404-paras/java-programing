package experiment2;
import java.util.*;

class student {
    int id;
    String name;
    int marks;

    student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

class Main {
    public static void main(String args[]) {

        ArrayList<student> list = new ArrayList<student>();

        list.add(new student(101, "Ashish", 79));
        list.add(new student(102, "Harshad", 84));
        list.add(new student(103, "Yogesh", 90));
        list.add(new student(104, "Ketan", 80));

        list.sort(new Comparator<student>() {
            public int compare(student s1, student s2) {
                return s1.marks - s2.marks;
            }
        });

        System.out.println("Student Records Sorted by Marks:");

        for (student s : list) {
            System.out.println("ID: " + s.id + ", Name: " + s.name + ", Marks: " + s.marks);
        }
    }
}