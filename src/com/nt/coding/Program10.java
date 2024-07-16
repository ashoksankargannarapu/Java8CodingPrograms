//Find the Youngest Employee in the organization using java 8
package com.nt.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Program10 {
	public static void main(String[] args) {
		Employee2 emp1=new Employee2(1, "Ashok", 30000, "developer", 32, 2019, "MALE", "IT");
		Employee2 emp2=new Employee2(2, "Sai", 40000, "software engineer", 33, 2018, "FEMALE", "HR");
		Employee2 emp3=new Employee2(3, "Ram", 50000, "tester", 34, 2017, "MALE", "Finance");
		Employee2 emp4=new Employee2(4, "Syam", 60000, "manager", 35, 2016, "MALE", "IT");
		Employee2 emp5=new Employee2(5, "Sai", 70000, "devops engineer", 36, 2015, "FEMALE", "SALES");
		Employee2 emp6=new Employee2(6, "Dinesh", 80000, "developer", 34, 2022, "MALE", "HR");
		  
		 List<Employee2> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
		 Optional<Employee2> youngestEmployee = list.stream().min(Comparator.comparingInt(Employee2::getAge));
		 youngestEmployee.ifPresent(emp->System.out.println("Youngest Employyee:"+emp));
	}

}
