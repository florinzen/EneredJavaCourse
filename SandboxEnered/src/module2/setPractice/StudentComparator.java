package module2.setPractice;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student otherStudent) {
        System.out.println("Compare to invoked");
        int result = student.getSchool().compareTo(otherStudent.getSchool());
        if(result == 0) {
            result = student.getName().compareTo(otherStudent.getName());
        }
        return result;
    }
}
