//Find the Employees who joined the organization in a specific year


package com.nt.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Program11 {
	public static void main(String[] args) {
		Employee2 emp1=new Employee2(1, "Ashok", 30000, "developer", 32, 2019, "MALE", "IT");
		Employee2 emp2=new Employee2(2, "Sai", 40000, "software engineer", 33, 2018, "FEMALE", "HR");
		Employee2 emp3=new Employee2(3, "Ram", 50000, "tester", 34, 2017, "MALE", "Finance");
		Employee2 emp4=new Employee2(4, "Syam", 60000, "manager", 35, 2016, "MALE", "IT");
		Employee2 emp5=new Employee2(5, "Sai", 70000, "devops engineer", 36, 2015, "FEMALE", "SALES");
		Employee2 emp6=new Employee2(6, "Dinesh", 80000, "developer", 34, 2019, "MALE", "HR");
		  
		 List<Employee2> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
		 int specificYear=2019;
		 List<Employee2> list2 = list.stream().filter(i->i.getJoiningYear()==specificYear).collect(Collectors.toList());
		 System.out.println("Employees joined in specific year::"+specificYear);
		 list2.forEach(emp->System.out.println(emp) );
	}

}
