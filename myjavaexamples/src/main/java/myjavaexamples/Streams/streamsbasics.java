package myjavaexamples.src.main.java.myjavaexamples.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamsbasics {
	public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,4,2,5,9);
//Intermediate operations 
	//map method helps to perform operation on the each objects
	List<Integer> cube=list.stream().map(val->val*val*val).collect(Collectors.toList());
	System.out.println(cube);
	
	//filter operation helps in filtering content of stream(here we will print all odd numbers)
	List<Integer> oddnums=list.stream().filter(e->e%2!=0).collect(Collectors.toList());
	System.out.println(oddnums);
	
	//Simple sorting
	List<Integer> sorted=list.stream().sorted().collect(Collectors.toList());
	
	System.out.println(sorted);
	
	//flatmap to convert two level of stream into one stream
	List<Integer> list1=Arrays.asList(1,2,4,2,5,9);
	List<Integer> list2=Arrays.asList(100,200,400,20,50,90);
	List<List<Integer>> twolvlstrem=Arrays.asList(list1,list2);
	
	List<Integer> flatmap=twolvlstrem.stream().flatMap(e->e.stream().map(f-> f*f)).collect(Collectors.toList());
	System.out.println(flatmap);
	
	
	//distinct to remove all duplicates
	
	List<Integer> distinct=list.stream().distinct().collect(Collectors.toList());
	System.out.println(distinct);
	
	//to perform other operation or call intermediate functions
	
	List<Integer> peek=list.stream().map(e-> e*e).filter(y->y%2==0).peek(e->System.out.println(e)).collect(Collectors.toList()); 
	System.out.println(peek);
//terminal operations
	//.Collect used to convert stream to list
	
	//count-helps to find the count of processed collections
	
	long noofevennumbersaftersquared=list.stream().map(e->e*e).filter(y->y%2==0).count();
	System.out.println(noofevennumbersaftersquared);
	
	//allMatch() operation helps us to get the answer: Do all the elements of the stream match the condition?
	
	List<String> listOfCountries = Arrays.asList("India", "Indonesia", "Nepal", "Afghanistan");
	boolean areAllElementsStartingWithI = listOfCountries.stream().allMatch(x -> x.toString().startsWith("I"));
	System.out.println(areAllElementsStartingWithI);
	
	//As compared to the allMatch() anyMatch() helps to check if either one of 
	//the elements in the stream matched the condition.

	boolean areAllElementsStartingWithI1 = listOfCountries.stream().anyMatch(x -> x.toString().startsWith("I"));
	System.out.println(areAllElementsStartingWithI1);
	
	//foreach to iterate over resultant collections
	
	listOfCountries.stream()
    .filter(x-> x.toString().startsWith("I"))
    .forEach(System.out::println);
	
	
		
	}

}
