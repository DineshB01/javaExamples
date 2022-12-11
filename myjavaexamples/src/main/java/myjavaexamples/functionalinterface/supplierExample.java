package myjavaexamples.functionalinterface;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Locale;
import java.util.function.Supplier;

public class supplierExample {
    //return a output but not accept any input
    //Example fetching or returning otp
    public static void main(String[] args){
        Supplier<Integer> getCurrentDay=()-> LocalDate.now().getDayOfMonth();
        System.out.println(getCurrentDay.get().toString());
    }


}
