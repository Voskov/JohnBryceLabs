package lab1;

/**
 * Created by Voskov on 22/03/2014.
 */

public class Employee {
    private String first;
    private String last;
    private String department;
    private double salary;

    //CTORs
    public Employee(double salary, String first, String last, String department) {
        this.salary = salary;
        this.first = first;
        this.last = last;
        this.department = department;
    }

    // Getters/Setters
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
