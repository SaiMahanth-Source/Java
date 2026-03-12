class ForInner{
    public void show(){
        System.out.println("Show method in class ForInner ");
    }
    public void display(){
        System.out.println("Show display in class ForInner ");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args){

        ForInner fi = new  ForInner(){
            /*
            Inner class implementation only when it is used once also we can use other methods as well and method
            overriding is applicable here, not allowed to use for creation of object and the object created is for the
            anonymous inner class
            */
            public void show(){
                System.out.println("Show method in inner class ");
            }
        };
        fi.show();
        fi.display();

    }
}
