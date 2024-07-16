//Task:: Get Emp Name,age whose salary is greater than 50,000
package com.nt.coding;

import java.util.Arrays;
import java.util.List;

public class Program4 {
	public static void main(String[] args) {
		
		User1 u1=new User1(22, "Sankar",24000);
		User1 u2=new User1(23, "Ashok",48000);
		User1 u3=new User1(24, "Sai",54000);
		User1 u4=new User1(25, "Ram",98000);
		User1 u5=new User1(26, "Prem",50000);
		User1 u6=new User1(27, "Subhash",12000);
		
		List<User1> list = Arrays.asList(u1,u2,u3,u4,u5,u6);
		list.stream().filter(i->i.salary>=50000).map(i->i.name+"--"+i.age).forEach(System.out::println);;
		
		
	}

}

class User1{
	int age;
	String name;
	double salary;
	public User1(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	
}
