package myjavaexamples.lambdas;

public class lambda {

    public static void main(String[] args){
        //creating a method like variable which can be passed around
        //expression with no params
        voidMethodWithNoParams method=(input)->{
            System.out.println(input);
            return input;
        };

        voidMethodWithNoParams method1=input-> {return input;};
        System.out.println(method.printMyString("test"));
        //expression with two params
        voidMethodWithTwoParams addtwoParams=(a,b)->{
            return String.valueOf(a+b);
        };
        System.out.println(addtwoParams.addTwoNumbers(6,7));




    }
    //accessing variables outside lambda expressions
    int sum=1;
    public void myMethod(){
        int test=0;
        voidMethodWithTwoParams twoParam=(a,b)->{
            this.sum=1;
            int sum=2;

            return String.valueOf((a+b+this.sum+sum+test));
        };
    }
}
