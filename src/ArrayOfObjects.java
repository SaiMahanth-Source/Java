public class ArrayOfObjects {
    public static void main(String[] args){

        Employee e1 = new Employee(); // class Employye belongs to same package so need not to create another class again
        e1.employeeId = 13596924;
        e1.employeeName = "Rishi";
        e1.employSalary = "9999001";

        Employee e2 = new Employee();
        e2.employeeId = 1359692402;
        e2.employeeName = "Mahanth";
        e2.employSalary = "1000090";

        Employee e3 = new Employee();
        e3.employeeId = 124091;
        e3.employeeName = "Sai Mahanth Nagendla";
        e3.employSalary = "119000";

        Employee[] emps = new Employee[3]; // Creating array of objects type Employee
        emps[0] = e1; // Assigning address ob object to the Employee array created respectively
        emps[1] = e2;
        emps[2] = e3;

        System.out.println("Printing employee Details using normal for loop : ");
        for(int i = 0; i < emps.length; i++){
            System.out.println(emps[i].employeeId + " : " + emps[i].employeeName + " : " + emps[i].employSalary);
        }
        System.out.println("\nPrinting employee Details using normal enhanced for loop : ");
        for( Employee e : emps){
            System.out.println(e.employeeId + " : " + e.employeeName + " : " + e.employSalary);
        }
    }
}
