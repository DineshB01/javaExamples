package myjavaexamples.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamsadvanced1 {

	public static void main(String[] args) {
		//task to group a list of employee object in a map based on job title
		Employee e1=new Employee("doc","dinesh",100);
		Employee e2=new Employee("doc","rakesh",222);
		Employee e3=new Employee("doc","deepan",121);
		Employee e4=new Employee("eng","arun",312);
		Employee e5=new Employee("eng","varun",133);
		List<Employee> emp=Arrays.asList(e1,e2,e3,e4,e5);
		
		Map<String,List<Employee>> groupedbytitle=emp.stream().collect(Collectors.groupingBy(Employee::getTitle));
		System.out.println(groupedbytitle.get("doc").get(0).name);
		
		System.out.println("salaryavg"+emp.stream().mapToInt(e->e.salary).average().getAsDouble());
		
	}

}

class Employee{
	String title;
	String name;
	int salary;
	Employee(String title,String name,int salary){
		this.title=title;
		this.name=name;
		this.salary=salary;
	}
	String getTitle(){
		return this.title;
	}
	
}
