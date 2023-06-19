package Deving;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Emplyoer;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

        List<Emplyoer> list = new ArrayList<>();
		System.out.println("How Many Employers Will Be Registrated?: ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Employer #" + (i + 1) + ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			Emplyoer emp = new Emplyoer(id, name, salary);

			list.add(emp);

		}

		System.out.println("Enter the Employer ID who will have the increase salary: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("This id does not exist! ");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Emplyoer emp : list) {
			System.out.println(emp);
		}

	}

	public static Integer position(List<Emplyoer> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}