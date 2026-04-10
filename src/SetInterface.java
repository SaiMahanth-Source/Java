import java.util.*;

/*
    Only difference is Set doesn't allow duplicates, and it is according to the values mostly
    like for same string value memory address will be same and
 */
public class SetInterface {
    public static void main(String[] args){

        Employee[] employees1 = new Employee[5];

        Scanner sc  = new Scanner(System.in);

        try {
            for(int i = 0; i < employees1.length; i++){
                employees1[i] = new Employee();

                employees1[i].employeeId = Integer.parseInt(sc.nextLine());
                employees1[i].employeeName = sc.nextLine();
                employees1[i].employSalary = sc.nextLine();
            }
        }
        catch(NoSuchElementException e){
            System.out.println("Invalid Input");
        }
        finally {
            sc.close();
        }

        Set<Employee> employees2 = new HashSet<Employee>(); // Not applicable for auto sort
        for(int i = 0; i < employees1.length; i++){
            employees2.add(employees1[i]);
        }

        System.out.println("\n-----Using enhanced for loop with Hash Set-----");
        for(Employee e:employees2){
            System.out.println("\n" + e.employeeId + " " + e.employeeName + " " + e.employSalary);
        }

        System.out.println("\n-----Using while loop with iterator-----");
        Iterator<Employee> iteratorObjects= employees2.iterator();
        while(iteratorObjects.hasNext()){
            Employee employee = iteratorObjects.next();
            System.out.println("\nEmployee Id : " + employee.employeeId);
            System.out.println("Employee Name : " + employee.employeeName);
            System.out.println("Employee Salary : " + employee.employSalary);
            System.out.println("---------------------------------------");
        }
    }
}