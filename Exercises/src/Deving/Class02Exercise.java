package Deving;
import java.util.Locale;
import java.util.Scanner;
import Entities.Class02Product;

public class Class02Exercise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		// Instanciando um vetor do tipo valor:
		String vect2[] = new String[] {"Maria", "josé"};
    	double vect3[] = new double[5];
		
		// Instanciando um vetor do tipo referencia(objeto/classe):
		//Class02Product[] vect = new Class02Product[n];
		
		//O laço for é sempre usado para acessar/modificar uma variavel do tipo vetor/array
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite um valor: ");
			//String name = sc.next();
			double price = sc.nextDouble();
			//Vetores comum
			//vect2[i] = price;
			vect3[i] = 0;
			vect3[1] = 1;
			vect3[2] = 4;
			vect3[3] = 3;
			vect3[4] = 4;
			
			
			
			// Com essa instancia aponto na memoria o objeto a ser usado/explicito
			//vect[i] = new Class02Product(price, name); 
			System.out.println(vect3[i]);
					
		}
		
	//	System.out.println(vect2[0]);
		
		//double soma = soma + vect2[0];
		
		System.out.println("Digite de 0 a 4 a posição que gostaria de acessar: ");
		for(int i=0; i<n; i++) {
			int pos = sc.nextInt();
			vect2[i] = vect2[pos];
			System.out.println(vect2[pos]);
			
		}
		
	}
	
}
