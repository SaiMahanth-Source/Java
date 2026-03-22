public class TryWithMultipleCatch {
    public static void main(String[] args) {

        Employee e1 = new Employee(); // class Employee belongs to same package so there's no need create another class again
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

        try {
            /*
            If any statements which are before critical statements then execution will be continued make sure to
            mention only critical statement in the try block
            */
            //int cal = 15/0; // Critical statements which has to be placed in try block
            for(int i = 0; i <= emps.length; i++){
                System.out.println(emps[i].employeeId + " : " + emps[i].employeeName + " : " + emps[i].employSalary);
            }
        }
        catch(ArithmeticException ae){// This will be able to catch ArithmeticException
            System.out.println(ae);
        }
        catch(ArrayIndexOutOfBoundsException aioobe){// This will be able to catch ArithmeticException
            //System.out.println(aioobe);
            System.out.println(aioobe.getMessage()); // Which gives the exception description
        }
        catch(Exception e){ // This will catch any exception
            System.out.println(e);
        }
    }
}