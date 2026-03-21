class Details{
    static void toString(Employee obj){
        System.out.println(obj.employeeId + " : " +  obj.employeeName + " : "  + obj.employSalary);
    }
}

public class ExceptionTryCatch {
    public static void main(String[] args){

        Employee e = new Employee(); // Creating object of employee
        e.employeeId = 1119;
        e.employeeName = "Chintu Anshu";
        e.employSalary = "0";

        int sal = Integer.parseInt(e.employSalary); //Parsing the integer value of character type to int (auto unboxing)
        try {
            /*
            If any statements which are before critical statements then execution will be continued make sure to
            mention only critical statement in the try block
            */
            int cal = 15/0; // Critical statements which has to be placed in try block
        }
        catch(Exception e1){ // If any exception was thrown then catch block will be catching the exception
            System.out.println("Something went wrong : ");
        }
        Details.toString(e);
        /*
        We can conclude that as we have critical statements though execution was not interrupted so it's the best
        practice to include the critical statements in the try catch
         */
    }
}
