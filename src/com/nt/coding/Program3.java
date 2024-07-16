//Print name with its length which are starting with 'A' using Stream API
package com.nt.coding;

import java.util.Arrays;
import java.util.List;

public class Program3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ashok","Sankar","Sailu","Anu","Ankitha");
		list.stream().filter(i->i.startsWith("A")).map(name->name+"--"+name.length()).forEach(System.out::println);
	}

}
