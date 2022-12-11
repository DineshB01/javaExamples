package myjavaexamples.functionalinterface;

import java.util.function.Function;

//It can accept any datatype return any datatype as output compared to predicate interface which returns only boolean
public class FunctionIntExample {
    public static void main(String[] args){
        //format Funtion<InputDataType,OutputDataType>
        Function<String,String> convertToUpperCase= input->input.toUpperCase();
        //apply
        System.out.println("Convert To uppercase : "+convertToUpperCase.apply("hhhhjjjjkkkk"));
        //identity - return same value as output
        Function<String,String> returnSameObj=Function.identity();
        System.out.println("Return same object : "+returnSameObj.apply("Test"));
        //andThen chain operator
        Function<Integer,Integer> multiplyBytwoAnddividebythree=a->{
            return a*2;
        };
        multiplyBytwoAnddividebythree=multiplyBytwoAnddividebythree.andThen(a->{
            return a/3;
        });
        System.out.println("Multiply by 2 divie by 3 : "+multiplyBytwoAnddividebythree.apply(3));
        //compose - in this first compose id exected and the first operation is applied

        Function<Integer,Integer> compose=a->{
            return a*2;
        };
        compose=compose.compose(a->{return a%4;});

        System.out.println("First % by 4 and then multiply by 2 : "+ compose.apply(16));
    }
}
