package module2.setPractice;

public class Student {
    private String name;
    private double grade;
    private String school;

    public Student(String name, double grade, String school) {
        this.name = name;
        this.grade = grade;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", school='" + school + '\'' +
                '}';
    }

}
