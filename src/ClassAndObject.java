class Employee{ /* Class created which is a blueprint to create an object which is having properties and behaviors
    which are methods */
    int employeeId;
    String employeeName;;
    String employSalary;
}

public class ClassAndObject {
    public static void main(String[] args){

        Employee emp1 = new Employee(); /* new keyword is to create an object by JVM of Type Employee storing address
        of it in the reference variable emp1 of type Employee */
        emp1.employeeId = 1;
        emp1.employeeName = "Jack";
        emp1.employSalary = "11000";;
        Employee emp2 = new Employee();
        emp2.employeeId = 2;
        emp2.employeeName = "Jill";
        emp2.employSalary = "21000";
        Employee emp3 = new Employee();
        emp3.employeeId = 3;
        emp3.employeeName = "Zack";
        emp3.employSalary = "31000";

        System.out.println(emp1.employeeId + " " + emp1.employeeName + " " + emp1.employSalary);
        System.out.println(emp2.employeeId + " " + emp2.employeeName + " " + emp2.employSalary);
        System.out.println(emp3.employeeId + " " + emp3.employeeName + " " + emp3.employSalary);
    }
}
