package myjavaexamples.functionalinterface;

import java.util.function.BinaryOperator;

public class BiFuntionalExample {
    public static void main(String[] args){
        //biPredicate 2 imput parameters and return boolean BiFunction<T,U>
        //BiFuntion accept 2 input and return output as datayupe specified BiFunction<T,U,R>
        //BiFuntional BiConsumer BinaryOperator(Accept 2 input of ame data type and return output of same datype)
        BinaryOperator<String> appendandconvert=(word1,word2)->(word1+word2).toUpperCase();

        System.out.println(appendandconvert.apply("tset","tests"));

        BinaryOperator<Integer> maxOperation=BinaryOperator.maxBy((a,b)->(a>b)?1:((a==b)?0:-1));
        System.out.println("The largest number is : "+maxOperation.apply(4,9));
        BinaryOperator<Integer> minOperation=BinaryOperator.minBy((a,b)->(a>b)?1:((a==b)?0:-1));
        System.out.println("The largest number is : "+minOperation.apply(4,9));
    }
}
