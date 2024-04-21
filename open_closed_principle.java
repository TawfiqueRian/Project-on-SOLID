/**
 * Title: This program demonstrates the Open/Closed Principle by implementing a simple payroll system.
 * Author: Md. Tawfiqul Islam, Undergraduate student, Khulna University
 */

// Abstract class for Employee
abstract class Employee {
    private String name;

    /**
     * Constructor for Employee class.
     * @param name The name of the employee.
     */
    public Employee(String name) {
        this.name = name;
    }

    /**
     * Abstract method to calculate the monthly salary.
     * Subclasses must implement this method.
     * @return The monthly salary of the employee.
     */
    public abstract double calculateSalary();
}

// Concrete subclass for HourlyEmployee
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    /**
     * Constructor for HourlyEmployee class.
     * @param name The name of the employee.
     * @param hourlyRate The hourly rate of the employee.
     * @param hoursWorked The number of hours worked by the employee.
     */
    public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Calculates the monthly salary for an hourly employee.
     * @return The monthly salary of the hourly employee.
     */
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Concrete subclass for SalariedEmployee
class SalariedEmployee extends Employee {
    private double monthlySalary;

    /**
     * Constructor for SalariedEmployee class.
     * @param name The name of the employee.
     * @param monthlySalary The monthly salary of the employee.
     */
    public SalariedEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    /**
     * Calculates the monthly salary for a salaried employee.
     * @return The monthly salary of the salaried employee.
     */
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

public class open_closed_principle {
    /**
     * Main method to demonstrate the payroll system.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Creating instances of different types of employees
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Md. Tawfiqul Islam", 15.50, 160);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Md. Iftekharul Islam", 3000);

        // Calculating and printing the monthly salaries
        System.out.println("Monthly Salary of " + hourlyEmployee.getName() + ": $" + hourlyEmployee.calculateSalary());
        System.out.println("Monthly Salary of " + salariedEmployee.getName() + ": $" + salariedEmployee.calculateSalary());
    }
}
