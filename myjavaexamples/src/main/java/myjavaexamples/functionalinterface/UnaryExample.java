package myjavaexamples.functionalinterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryExample {
    //both input and output datatype are same we can use this
    //Example take an object manipulate inside object and return modified object
    //Unary operator is child of funtional interface
    public static void main(String[] args){

        UnaryOperator<String> convertToUpperCase= input->input.toUpperCase();
        //apply
        System.out.println("Convert To uppercase : "+convertToUpperCase.apply("hhhhjjjjkkkk"));
        //identity - return same value as output
        UnaryOperator<String> returnSameObj=UnaryOperator.identity();
        System.out.println("Return same object : "+returnSameObj.apply("Test"));
        //andThen chain operator
        Function<Integer,Integer> multiplyBytwoAnddividebythree=a->{
            return a*2;
        };
        UnaryOperator<Integer> div3=a->{
            return a*3;
        };
        //passing unary to funtion
        multiplyBytwoAnddividebythree=multiplyBytwoAnddividebythree.andThen(div3);
        System.out.println("Multiply by 2 divie by 3 : "+multiplyBytwoAnddividebythree.apply(3));
        //compose - in this first compose id exected and the first operation is applied

        multiplyBytwoAnddividebythree=multiplyBytwoAnddividebythree.compose(div3);
        System.out.println("run compose and previous : "+multiplyBytwoAnddividebythree.apply(3));

    }
}
