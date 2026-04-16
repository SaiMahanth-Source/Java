import java.util.Arrays;
import java.util.List;

public class NeedForStreamApi {
    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(11, 2, 13, 4, 5, 6, 7, 8, 19, 21);

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        for(Integer number : numbers){
            System.out.println(number);
        }

        numbers.forEach(n -> System.out.println(n));// forEach method which belongs to Iterable interface

//        for(int i = 0; i < numbers.size(); i++){
//
//            int n =  numbers.get(i);
//            if(n % 2 == 0){
//                n = n * 2;
//                sum = sum + n;
//            }
//        }
//        System.out.println(sum);
        /*
        Instead of doing the above calculation alike we have the simplest pre-calculation like filter, reduce etc.In
        stream api, and also it makes the code maintenance easier as well as we can reduce the no of lines in code
         */

    }
}
