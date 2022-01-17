package packageThree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeEmail;

    private String regex;
    private Pattern pattern;
    private Matcher matcher;

    // Constructor
    public Employee(int employeeId, String employeeName, String employeeEmail) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.regex = "";
        this.pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        this.matcher = this.pattern.matcher("");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if (employeeName == null) {
            return;
        }
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.regex = "@company.com";
        this.pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        this.matcher = pattern.matcher(employeeEmail);

        if (employeeEmail == null || !matcher.find()) {
            System.out.println("Error Occurred! Please provide a valid email");
            return;
        }

        this.employeeEmail = employeeEmail;
    }

    // Abstract Functions
    public abstract void display(); // will not have its implementation(body of the function)

}

public class AbstractClasses {

    public static void main(String[] args) {
        // Abstract Classes -> can't instantiate Employee class
//        Employee employee = new Employee(28, "Afzal", "afzal@company.com");

        Employee employee = new Employee(28, "Afzal", "afzal@company.com") {
            @Override
            public void display() {
                System.out.println(this.getEmployeeId() + " : " + this.getEmployeeName() + " : " + this.getEmployeeEmail());
            }
        };
        employee.display();

        employee.setEmployeeId(30);
        employee.setEmployeeName("Subhash");
        employee.setEmployeeEmail("subhash@company.com");
        employee.display();
    }
}
