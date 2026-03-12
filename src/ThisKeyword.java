class Human{
    public static String citizenship = "Indian";
    private String name;
    private int  age;
    public static void show(){
        System.out.println("Details of Humans : ");
    }
    public static void display(int i){
        System.out.println("Human Details " + i + " : ");
    }

    public void setName(String name, Human human) {
        human.name = name;// Here we need object for assigning as local and instance variable names are same
    }
    public void setAge(int age) {
        this.age = age; /* Here this keyword refers to the current object who is calling the method and when this
        keyword is used there is no `necessity of receiving object again */
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {

        Human h1 = new Human();
        h1.setName("Sai Mahanth Nagendla", h1);
        h1.setAge(27);

        Human h2 = new Human();
        h2.setName("Rishi", h2);
        h2.setAge(24);

        Human h3 = new Human();
        h2.setName("Aplha", h3);
        h2.setAge(26);

        Human[] humans = new Human[3];
        humans[0] = h1;
        humans[1] = h2;
        humans[2] = h3;

        Human.show();
        for(int i = 0; i < humans.length; i++){
            Human.display(i + 1);
            System.out.println("Citizenship : " + Human.citizenship);
            System.out.println("Name : " + humans[i].getName());
            System.out.println("Age : " + humans[i].getAge());
            System.out.println("-------------------------------------------------");
        }
    }
}
