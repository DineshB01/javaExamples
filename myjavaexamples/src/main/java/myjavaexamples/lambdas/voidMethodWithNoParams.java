package myjavaexamples.lambdas;

@FunctionalInterface
public interface voidMethodWithNoParams {
    //interface can have default,static,abstarct
    //functional interface can only have one abstract method,can have any muber of static or default method
    //dafault method once implemented can be invoked by all interfaces extending parent interface or can be overridden by them
    //all members of interface are public final static no need access modifiers
    String printMyString(String data);
}
