package Deving;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Instant d01 = Instant.now();
		List<Integer> list = new ArrayList<>();
		List<String> listName = new ArrayList<>();
		int tamanho;
		int quantity = 0;
		int escolha = 0;
		
		
		System.out.println("Qual vai ser o tamnho do seu estoque?: ");
	    tamanho = sc.nextInt();
	    
		for(int i=0; i<tamanho; i++) {
			System.out.print("Product name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Product quantity: ");
		    quantity = sc.nextInt();
			list.add(quantity);
			listName.add(name);
		
			
		}
		
		System.out.println(list.get(0) + ", " + listName.get(0));
		System.out.println(list.get(1) + ", " + listName.get(1));
		System.out.println(list.get(2) + ", " + listName.get(2));
		
		System.out.println("Digite quantas vendas foram feitas: ");
		int sales = sc.nextInt();
	
		
		System.out.println("Qual item você gostaria de vender?: ");
		escolha = sc.nextInt();
		
		for(int i=0; i<tamanho; i++){
			if(escolha == 1) {
				quantity = list.get(0) - sales;
				list.set(0, quantity);
				System.out.println(list.get(i) + " , " + listName.get(i));
				} else if(escolha == 2) {
					quantity = list.get(1) - sales;
					list.set(1, quantity);
					System.out.println(list.get(i) + " , " + listName.get(i));
				} else if(escolha == 3) {
					quantity = list.get(2) - sales;
					list.set(2, quantity);
					System.out.println(list.get(i) + " , " + listName.get(i));
				}
				
			}
		
		
		
		
		System.out.println("Terminado. " + d01);

	}
}
