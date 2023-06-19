package Deving;
import java.util.Locale;
import java.util.Scanner;
import Entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	    String name = null;
	    int price = 0;
	    int quantity = 0;
		int total = price * quantity;
	    Product prod = new Product(price, quantity, name, total);
		
		System.out.println("Bem vindo, digite o nome do seu produto: ");
		name = sc.nextLine();
		prod.setName(name);
		
		System.out.println("Digite o preço do seu produto: ");
	    price = sc.nextInt();
	    prod.setPrice(price);
	    
	    System.out.println("Digite a quantidade no estoque: ");
	    quantity = sc.nextInt();
	    prod.setQuantity(quantity);
         
	    prod.setTotalValue(price, quantity);
	    System.out.println("Valor total no estoque: " + prod.getTotalValue());
	    
	}	
}
			
		
		
	