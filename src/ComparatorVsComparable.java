import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*
Integer class by default implements Comparable that is why sort works directly passing the list unlike Student type
and in order to overcome this and instead of passing comparator we can directly implement the logic that we want to
below is how its implemented so now we can directly sort the list just by passing list of type Student to sort method
 */
class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age){
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class ComparatorVsComparable {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(21);
//        list.add(3);
//        list.add(14);
//        list.add(5);

//        System.out.println(list);
//
//        Collections.sort(list);

//        System.out.println(list);

//        Comparator<Integer> comparator1 = new  Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//
//                if(o1%10 >  o2%10) {
//                    return 1 ;
//                }
//                else{
//                    return -1;
//                }
//
//            }
//        };


        // Below is using lambda expression as Comparator interface is functional interface
        Comparator<Integer> comparator2 = (o1, o2) -> (o1%10 >  o2%10) ? 1 : -1 ;

//        Collections.sort(list);

//        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student(19, "Chintu"));
        students.add(new Student(21, "Sai"));
        students.add(new Student(24, "Mahanth"));
        students.add(new Student(11, "Chinnu"));
        students.add(new Student(13, "Kanna"));

//        System.out.println("Before sorting:");
//        System.out.println(students);

        Comparator<Student> comp1 = new  Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {

                if(o1.age >  o2.age) {
                    return 1 ;
                }
                else{
                    return -1;
                }
            }
        };

        // Below is using lambda expression as Comparator interface is functional interface
//        Comparator<Student> comp2 = (o1,  o2) -> (o1.age >  o2.age) ? 1 : -1 ;

        Collections.sort(students, comp1);// Sorted list using comparator

        Collections.sort(students);

        System.out.println("Sorted list of Students using Comparable interface implementation instead of passing " +
                "Comparator");

        for(Student student: students){
            System.out.println(student);
        }
    }
}
