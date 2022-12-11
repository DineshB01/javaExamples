package myjavaexamples.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//Use this interface when we accept a array of object and need to perform a function on each of them and return a boolean
public class PredicateExample {
    public static void main(String[] args){

        //Creating a predicte to check event
        Predicate<Integer> isEven=i->i%2==0;
        //Creating a predicate to check greater
        Predicate<Integer> isGreater=i->i>50;

        //calling predivate method
        System.out.println("Is number even: "+ isEven.test(61));
        System.out.println("Is number even: "+ isGreater.test(61));
        //predicate and chaining
        System.out.println("And Chaining : "+isEven.and(isGreater).test(52));
        //predicate or chaining
        System.out.println("Or Chaining : "+isEven.or(isGreater).test(52));
        //predicate not operator like
        System.out.println("Not Chaining : "+isEven.negate().test(52));

        //with streams
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> collect=list.stream().filter(isEven).collect(Collectors.toList());

        System.out.println(collect);

        //check string or compare two objects using isEqual method
        Predicate<String> checkEquality=Predicate.isEqual("testqa");
        System.out.println(checkEquality.test("testqa"));
    }
}
