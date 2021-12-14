package basics.objectOrientedProgramming;

class Employee {
    private String empName;
    private int empId;
    int age;
    String designation;
    int salary;

//    Employee() {}

    Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }
//    Employee(String empName, int empId, int age, String designation, int salary) {
//        this.empName = empName;
//        this.empId = empId;
//        this.age = age;
//        this.designation = designation;
//        this.salary = salary;
//    }

    void display() {
        System.out.println("Employee Name is : " + this.empName);
        System.out.println("Employee ID is : " + this.empId);
        System.out.println("Employee Age is : " + this.age);
        System.out.println("Employee Designation is : " + this.designation);
        System.out.println("Employee Salary is : " + this.salary);
    }
}

public class More {

    public static void main(String[] args) {

//        Employee employee = new Employee("Afzal", 5678, 28, "Trainer", 10000);
//        employee.display(); // employee@246.display()

//        System.out.println(employee);

//        System.out.println();


//        Employee tempObj; // Declaration
//        tempObj = null;
//        tempObj = employee;
//        System.out.println(tempObj);


//        employee.empName = "Naveen"; // I can access empName from Main using the employee object
//        employee.salary = 20000; // I can access salary from Main using the employee object
//
//        employee.display(); // Employee@246.display()
//        System.out.println();

//        tempObj = new Employee();
//        System.out.println(tempObj);
//        tempObj.display(); // Employee@2f92e0f4.display()


        // Admin -> University
        // Add the new enrolled Employees to the DataBase

        Employee employeeOne = new Employee("Afzal", 2345);
        Employee employeeTwo = new Employee("Swanad", 2346);
        Employee employeeThree = new Employee("Raghu", 2347);

    }

}
