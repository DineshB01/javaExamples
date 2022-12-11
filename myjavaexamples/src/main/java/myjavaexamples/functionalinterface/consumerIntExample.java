package myjavaexamples.functionalinterface;

import java.util.function.Consumer;

public class consumerIntExample {
    //accept input not give any output
    public static void main(String[] args){
        Consumer<String> voidReturnTrpe=e-> System.out.println(e.toUpperCase());

        voidReturnTrpe.accept("test");

        Consumer<String> appendInput=e-> System.out.println("Hello"+e);

        //since return type is void in chain so values are not affecting other methods
        appendInput.andThen(voidReturnTrpe).accept("Java");
    }
}
