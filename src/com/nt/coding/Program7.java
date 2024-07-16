//How many male and female employees are there using stream API
package com.nt.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program7 {
	public static void main(String[] args) {
		Employee1 e1=new Employee1(1, "Ashok", 30000, "developer", 32, 2019, "MALE", "IT");
		Employee1 e2=new Employee1(2, "Sai", 40000, "software engineer", 33, 2018, "FEMALE", "IT");
		Employee1 e3=new Employee1(3, "Ram", 50000, "tester", 34, 2017, "MALE", "IT");
		Employee1 e4=new Employee1(4, "Syam", 60000, "manager", 35, 2016, "MALE", "IT");
		Employee1 e5=new Employee1(5, "Sai", 70000, "devops engineer", 36, 2015, "FEMALE", "IT");
		Employee1 e6=new Employee1(6, "Dinesh", 80000, "developer", 34, 2022, "MALE", "IT");
		
		List<Employee1> list = Arrays.asList(e1,e2,e3,e4,e5,e6);
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(i->i.gender,Collectors.counting()));
		collect.forEach((gender,count)->{
			System.out.println((gender+"---"+count));
		});
	}

}

class Employee1{
	int id;
	String name;
	double salary;
	String role;
	int age;
	int joiningYear;
	String gender;
	String department;
	public Employee1(int id, String name, double salary, String role, int age, int joiningYear, String gender,
			String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
		this.age = age;
		this.joiningYear = joiningYear;
		this.gender = gender;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + ", age=" + age
				+ ", joiningYear=" + joiningYear + ", gender=" + gender + ", department=" + department + "]";
	}
	
}
