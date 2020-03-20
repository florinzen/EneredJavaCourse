package module3.ioexamples.objectstreamex;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Classroom implements Serializable {
    private int floor;
    private List<Student> students;

    Classroom(int floor) {
        students = new ArrayList<>();
        this.floor = floor;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "floor=" + floor +
                ", students=" + students +
                '}';
    }
}
