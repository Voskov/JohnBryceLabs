package lab1;

import java.util.ArrayList;

/**
 * Created by Voskov on 22/03/2014.
 */
public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(222.22, "Afghj", "Afghjk", "PC");
        Employee e2 = new Employee(111.11, "Bfghjk", "Bertyu", "HR");
        Employee e3 = new Employee(333.33, "Cghjm", "Cadfs", "PC");

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println("Avarage salary of all employees is - " + employeeStatistics.avarageSalary(employees));
        System.out.println("The amount of all employees is - " + employeeStatistics.numOfEmployees(employees));
        System.out.println("The amount of employees in the PC department is - " + employeeStatistics.numOfEmployees(employees, "PC"));

    }
}
