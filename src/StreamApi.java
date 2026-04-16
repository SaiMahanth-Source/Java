import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum1 = 0;
        for(int i = 0; i < numbers.size(); i++){

            int n =  numbers.get(i);
            if(n % 2 == 0){
                n = n * 2;
                sum1 = sum1 + n;
            }
        }
        System.out.println("After performing operations manually then sum is : " + sum1);

        Stream<Integer> stream1 = numbers.stream();
        Stream<Integer> stream2 = stream1.filter(i -> i % 2 == 0);
        Stream<Integer> stream3 = stream2.map(i -> i * 2);
        int sum2 = stream3.reduce(0, (c, e) -> c+e);

        System.out.println("After performing operations using stream api then sum is : " + sum2);

        int sum3 = numbers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                        .reduce(0, (c, e) -> c+e);

        System.out.println("After performing operations using stream api with no individual stream objects created is : "
                + sum3);

    }
}
