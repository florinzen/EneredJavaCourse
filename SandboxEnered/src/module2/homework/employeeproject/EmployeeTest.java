package module2.homework.employeeproject;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 3500);
        Employee emp2 = new Employee("Jennifer Collins", 3600);
        Employee emp3 = new Employee("Corey Hetfield", 2100);

        Employee emp4 = new Manager("Nancy Seinfeld", 5000, "IT");
        Employee emp5 = new Manager("Dennis Stanford", 4990, "Finance");

        Employee emp6 = new Director("Ryan Scott", 7000, "Microsoft");


        EmployeeRaiseCalculator raiseCalculator = new EmployeeRaiseCalculator();

        raiseCalculator.addEmployee(emp1);
        raiseCalculator.addEmployee(emp2);
        raiseCalculator.addEmployee(emp3);
        raiseCalculator.addEmployee(emp4);
        raiseCalculator.addEmployee(emp5);
        raiseCalculator.addEmployee(emp6);

        raiseCalculator.printRaises();

    }
}
