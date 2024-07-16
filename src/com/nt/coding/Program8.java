//How many Employees are there in Each department stream API

package com.nt.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program8 {
	public static void main(String[] args) {
		
	
	Employee2 emp1=new Employee2(1, "Ashok", 30000, "developer", 32, 2019, "MALE", "IT");
	Employee2 emp2=new Employee2(2, "Sai", 40000, "software engineer", 33, 2018, "FEMALE", "HR");
	Employee2 emp3=new Employee2(3, "Ram", 50000, "tester", 34, 2017, "MALE", "Finance");
	Employee2 emp4=new Employee2(4, "Syam", 60000, "manager", 35, 2016, "MALE", "IT");
	Employee2 emp5=new Employee2(5, "Sai", 70000, "devops engineer", 36, 2015, "FEMALE", "SALES");
	Employee2 emp6=new Employee2(6, "Dinesh", 80000, "developer", 34, 2022, "MALE", "HR");
	  
	 List<Employee2> list = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6);
	 Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee2::getDepartment,Collectors.counting()));

	 collect.forEach((key,value)->{
		 System.out.println(key+"---"+value);
	 });
	}
	
	
	

}
class Employee2{
	int id;
	String name;
	double salary;
	String role;
	int age;
	int joiningYear;
	String gender;
	String department;
	public Employee2(int id, String name, double salary, String role, int age, int joiningYear, String gender,
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + ", age=" + age
				+ ", joiningYear=" + joiningYear + ", gender=" + gender + ", department=" + department + "]";
	}
	
}

