package module2.setPractice;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());

        students.add(new Student("John Doe", 9.70, "Mihai Eminescu High School"));
        students.add(new Student("Lorem Ipsum", 7.95, "Emil Racovita High School"));
        students.add(new Student("Casus Beli", 8.20, "Mihai Eminescu High School"));
        students.add(new Student("Jessy Monroe", 6.50, "Mihai Eminescu High School"));
        students.add(new Student("Walter White", 9.32, "Emil Racovita High School"));
        students.add(new Student("Lars Ulrich", 9.15, "Costache Negruzzi High School"));
        students.add(new Student("Mihai Vasilache", 8.95, "Emil Racovita High School"));
        System.out.println(students.size());
        for(Student s : students) {
            System.out.println(s);
        }

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(9);
        numbers.add(4);
        numbers.add(1);

        for(Integer number : numbers) {
            System.out.println(number);
        }

    }
}