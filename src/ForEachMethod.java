import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(19, 13, 21, 11, 8, 1);

        numbers.forEach(n -> System.out.println(n));

        // Behind the scenes implementation of forEach method
        Consumer<Integer> consumer1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        /*
        Behind the scenes implementation of forEach method using lambda expression a because Consumer is a functional
        interface
         */

        Consumer<Integer> consumer2 = integer -> System.out.println(integer);// Which is similar to first line
    }
}
