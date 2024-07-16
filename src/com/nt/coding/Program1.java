//Print the names which are starting with "A"

package com.nt.coding;

import java.util.Arrays;
import java.util.List;

public class Program1 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ashok","Ram","Syam","Ajay");
		list.stream().filter(l->l.startsWith("A")).forEach(l->System.out.println(l));
	}

}
