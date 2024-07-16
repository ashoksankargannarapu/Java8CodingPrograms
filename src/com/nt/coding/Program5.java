//collect names of persons who are belong to india and store into names collection
package com.nt.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program5 {
	public static void main(String[] args) {
		
		Person p1=new Person("Ashok", "India");
		Person p2=new Person("Ram", "America");
		Person p3=new Person("Syam", "NewZeaLand");
		Person p4=new Person("Ramesh", "Pakistan");
		Person p5=new Person("Deepak", "India");
		
		List<Person> list = Arrays.asList(p1,p2,p3,p4,p5);
		List<String> names = list.stream().filter(i->i.country.equals("India")).map(i->i.name).collect(Collectors.toList());
		names.forEach(System.out::println );
	}

}
class Person{
	String name;
	String country;
	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
}
