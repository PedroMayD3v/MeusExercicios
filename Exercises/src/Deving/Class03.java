package Deving;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Class03 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-------------");

		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------");
		System.out.println("Index of Bob: " + list.lastIndexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("---------------");
		
		for (String x : result) {

			System.out.println(x);
		}

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
	}
}