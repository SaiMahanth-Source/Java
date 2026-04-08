import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class CollectionApiArrayList {
    public static void main(String[] args){

        Employee[] employees1 = new Employee[5];

        Scanner sc  = new Scanner(System.in);

        for(int i = 0; i < employees1.length; i++){
            employees1[i] = new Employee();
            employees1[i].employeeId = Integer.parseInt(sc.nextLine());
            employees1[i].employeeName = sc.nextLine();
            employees1[i].employSalary = sc.nextLine();
        }

//        Collection<Employee> employees2 = new ArrayList<>();
//        employees2.add(employees1[0]);
//        employees2.add(employees1[1]);
//        employees2.add(employees1[2]);
//
//        for(Employee e:employees2){
//            System.out.println(e.employeeId + " " + e.employeeName + " " + e.employSalary);
//        }

        List<Employee> employees2 = new ArrayList<>();
        for(int i = 0; i < employees1.length; i++){
            employees2.add(employees1[i]);
        }

        System.out.println("\n-----Using enhanced for loop-----");
        for(Employee e:employees2){
            System.out.println(e.employeeId + " " + e.employeeName + " " + e.employSalary);
        }

        System.out.println("\n-----Using normal for loop-----");
        for(int i = 0; i < employees2.size(); i++){

            if(!(employees2.get(i).employeeName.isBlank())){
                System.out.println("\n" + "Employee details : " + (i+1));
                System.out.println(employees2.get(i).employeeName + " " + employees2.get(i).employSalary);
            }
            else {
                try{
                    if(employees2.get(i).employeeName.isEmpty()){
                        throw new NullPointerException();
                    }
                }
                catch(NullPointerException ne){
                System.out.println("\nEmployee Name cannot be " + ne.getMessage());
                }
            }
        }
//        employees2.get(0).employeeId = employees1[0].employeeId;
//        System.out.println(Integer.MAX_VALUE) ;
    }
}




