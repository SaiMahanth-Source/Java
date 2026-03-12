abstract class ForAbstractAnonymousInnerClass{
    public abstract void show();
}

public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {

        ForAbstractAnonymousInnerClass faaic = new ForAbstractAnonymousInnerClass() {
            public void show() {
                System.out.println("Show method in abstract anonymous inner class ");
            }
        };
        faaic.show();
    }
}
