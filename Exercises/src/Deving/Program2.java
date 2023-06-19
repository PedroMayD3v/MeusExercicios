package Deving;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
		int n;
		
	
		 System.out.println("Quantos produtos serão criados no estoque?: ");
		n = sc.nextInt();
		
		String nameProduct[] = new String[n];
		int price[] = new int[n];
		int quantity[] = new int[n];
		int vendas;
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite as caracteristicas dos Produtos");
			
			System.out.print("Name: ");
			nameProduct[i] = sc.next();
			System.out.print("Price: ");
			price[i] = sc.nextInt();
			System.out.print("Quantity: ");
			quantity[i] = sc.nextInt();
			
		}
		
		System.out.println("Digite quantos foram vendidos do seu estoque: ");
		vendas = sc.nextInt();
		
		for (int i=1; i<n; i++) {
		quantity[i] = quantity[i] - vendas;
		price[i] = vendas * price[i];
		System.out.print("Você tem no estoque: " + nameProduct[i] + quantity[i] + " Quantidade, " + "No valor de: " + price[i]); 
		
		
			
		}
				
	}
}
