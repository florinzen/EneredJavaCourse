package module2.homework.employeeproject;

public class Director extends Employee {

    private String company;

    public Director(String name, double salary, String company) {
        super(name, salary);
        this.company = company;
    }

    public void makeAPressConference() {
        System.out.println(this.name + " is grateful for the success " + this.company +
                " has. The employees are doing a great job!");
    }

}

