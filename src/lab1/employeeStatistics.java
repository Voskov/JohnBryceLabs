package lab1;

import java.util.ArrayList;

/**
 * Created by Voskov on 22/03/2014.
 */
public class employeeStatistics {
    public static double avarageSalary(ArrayList<Employee> employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return (sum / employees.size());
    }

    public static int numOfEmployees(ArrayList<Employee> employees) {
        return employees.size();
    }

    public static int numOfEmployees(ArrayList<Employee> employees, String department) {
        int amount = 0;
        for (Employee employee: employees){
            if (employee.getDepartment().equals(department)){ //Note that because we're comparing strings, we should use 'equals'
                amount++;
            }
        }
        return amount;
    }
}
