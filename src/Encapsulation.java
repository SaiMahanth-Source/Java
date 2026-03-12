class Person{
    static String govt = "Telangana Government";
    private String name; /* Always make the variable names in the class private and this concept of making private
    called encapsulation */
    private int age;
    private String UID;
    static void display(){ // If it is private then we cannot acces as scope will be upto class only
        System.out.println("Displaying Person Details : ");
    }

    public void setName(String name, Person person) {/* Here we need the object to assign the value for object
    using same instance variable name and if we use local variable within the method then it's not necessary to pass the
    object along with argument */
        person.name = name;
    }
    public void setAge(int age,  Person person) {
        person.age = age;
    }
    public void setUID(String UID, Person person) {
        person.UID = UID;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getUID() {
        return UID;
    }
}
public class Encapsulation {
    public static void main(String[] args){

        Person p1 = new Person();
        p1.setName("Mahanth", p1);
        p1.setAge(21, p1);
        p1.setUID("715628118791", p1);

        Person p2 = new Person();
        p2.setName("Rishi", p2);
        p2.setAge(19, p2);
        p2.setUID("124091", p2);

        Person p3 = new Person();
        p3.setName("Sai Mahanth Nagendla", p3);
        p3.setAge(24, p3);
        p3.setUID("1359692402", p3);

        Person[] persons = new Person[3];
        /* Array of Person object */
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;

        for (Person p : persons) {
            Person.display();
            System.out.println(Person.govt + " : " + p.getName() + " : " + p.getAge() + " : " + p.getUID());
            // Static variable govt can be called using class name Person as it was class member
        }
    }
}
