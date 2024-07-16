//Print the names which are starting with 'A' and age is 22 above
package com.nt.coding;

import java.util.Arrays;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		
		User u1=new User(22, "Ram");
		User u2=new User(23, "Ashok");
		User u3=new User(2, "Syam");
		User u4=new User(12, "Prem");
		User u5=new User(54, "Raghu");
		
		List<User> list = Arrays.asList(u1,u2,u3,u4,u5);
		list.stream().filter(i->i.name.startsWith("A")&& i.age>=22).forEach(i->System.out.println(i));;
		
		
	}

}
class User{
	int age;
	String name;
	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
	
	
}
