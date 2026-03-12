/*
Anonymous object implies which is having no reference variable to store the address
it is used when we want to use the object only once not more than that
*/

public class AnonymousObject {
    public static void main(String[] args) {

        String penName = new Pen("Linc", 10).getName();
        /*
         Object created but not stored in any reference and scope is only once
         we cannot use the object now again as we don't have any reference value whihc is storing the address of that
         object created
         */
        System.out.println(penName);
    }
}
