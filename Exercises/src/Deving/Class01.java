package Deving;
import Entities.Stock;
import java.util.Locale;
import java.util.Scanner;

import Entities.Stock;

public class Class01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String name;
		int type = 0;
		double price =0;
		int quantity = 0;
		int sales = 0;
		

		Stock[] product = new Stock[10];
		int estoq;
		System.out.println("Olá, bem vindo ao Sistema de Estoque. ");
		System.out.println("Quantos produtos, serão adicionado ao seu estoque?");
		estoq = sc.nextInt();

		for (int i = 0; i < estoq; i++) {
			System.out.println();
			System.out.print("Product name: ");
			name = sc.next();
			System.out.print("Product type: ");
			type = sc.nextInt();
			System.out.print("Product price: ");
			price = sc.nextDouble();
			System.out.print("Quantity in Stock: ");
			quantity = sc.nextInt();
			product[i] = new Stock(name, type, price, quantity, sales);

		}

		System.out.println("Qual produto gostaria de verificar?");
		
		for (int i = 0; i < estoq; i++) {
			type = sc.nextInt();
			System.out.println("Valor do seu produto em estoque: " + product[i].valueStock()
					+ " Quantidade no estoque: " + product[i].getProductQuantity());
		}
		

		for(int i=0; i<estoq; i++) {
			
			System.out.println();
			System.out.println("Você gostaria de vender? Y/N ");
			String decision = sc.next();
			if(decision.equals("Y")) {
				System.out.println("Digite quantas unidades serão vendidas: ");
				sales = sc.nextInt();
				System.out.println(product[i].sales(sales, quantity, price));
				System.out.println("Obrigado por usar o sistema.");
	            } else {
	            	System.out.println("Encerrado.");
	            }
			
			
			  }
		}
	}