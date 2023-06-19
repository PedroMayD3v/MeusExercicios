package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Common;
import entities.Compania;
import entities.TaxPayer;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.println("Taxpayer #" + (i) + " data: ");
			System.out.println("Individual or company? (i/c) ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.println("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (option == 'i') {
				System.out.println("Health expenditures:");
				Double he = sc.nextDouble();
				Common x = new Common(name, anualIncome, he);
				list.add(x);
			} else {
				System.out.println("Number of employees: ");
				Integer numberEmp = sc.nextInt();
				Compania y = new Compania(name, anualIncome, name, anualIncome, numberEmp);
				list.add(y);
			}

		}
		
		System.out.println();
		System.out.println("TAXES PAID");
		for(TaxPayer tp : list) {		
			System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tp.tax()));
		}
		
		Double sum = 0.0;
		for(TaxPayer tp : list) {
			sum += tp.tax();
			System.out.println("Total taxes paid: " + sum);
		
		
	    //O COMPILADOR NÃO SABE DE QUAL METODO O METODO ABSTRATO É
		//MAS O POLIMORFISMO EM TEMPO DE EXECUÇÃO DEPENDENDO DO CASO ELE APONTA NA MEMORIA;
		
		sc.close();

	}

	}
}
