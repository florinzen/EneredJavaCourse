package module2.homework.employeeproject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRaiseCalculator {

    private List<Employee> employees = new ArrayList<>();

    private final double employeeFactor = 0.04;
    private final double managerFactor = 0.09;
    private final double directorFactor = 0.14;


    public void printRaises() {
        for(Employee e : employees) {
            double raise = 0;
            if(e instanceof Manager) {
                raise += e.getSalary() * managerFactor;
            } else if(e instanceof Director) {
                raise += e.getSalary() * directorFactor;
                ((Director) e).makeAPressConference();
            } else {
                raise += e.getSalary() * employeeFactor;
            }
            System.out.println("Raise for " + e.getName() + " is " + raise);
        }
    }

    public boolean addEmployee(Employee e) {
        return employees.add(e);
    }
}
