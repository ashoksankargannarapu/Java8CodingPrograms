//Write a java program to get MAX,MIN and AVG salary from given employees data using Stream API

package com.nt.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Program6 {
	public static void main(String[] args) {
		
		Employee e1=new Employee(22, "Ashok", 45000);
		Employee e2=new Employee(23, "Ram", 89000);
		Employee e3=new Employee(24, "Syam", 12000);
		Employee e4=new Employee(25, "Suresh", 25000);
		Employee e5=new Employee(26, "Rakesh", 96000);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
		Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(i->i.salary)));
		System.out.println("Max salary::"+max.get().salary);
		Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(i->i.salary)));
		System.out.println("Min salary::"+min.get().salary);
		Double avg = list.stream().collect(Collectors.averagingDouble(i->i.salary));
		System.out.println("Avg salary::"+avg);
		
	}

}
class Employee{
	int age;
	String name;
	double salary;
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
}
