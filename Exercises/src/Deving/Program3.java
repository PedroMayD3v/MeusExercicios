package Deving;
import java.util.Scanner;
import Entities.Product2;

public class Program3 {


	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		int n, menor, maior, qtdhomem, qtdmulher, soma, media;
		
		System.out.println("Quantas pessoas serão digitdas: ");
		n = sc.nextInt();
		
		int altura[] = new int[n];
		String genero[] = new String[n];
		
		System.out.println("Dados: ");
		
		for(int i=0; i<n; i++) {
			
			System.out.print("Altura: ");
			altura[i] = sc.nextInt();
			System.out.print("Genero: ");
		    genero[i] = sc.next();
		
		}
		
		maior = altura[0];
		menor = altura[0];
		
		for(int i=0; i<n; i++) {
			if(maior > altura[i]) {
				maior = altura[i];
			}
			
			if(menor < altura[i]) {
				menor = altura[i];
			}
		}
		
		qtdhomem = 0;
		qtdmulher=0; 
				
		for(int i=0; i<n; i++) {
			if(genero[i].equals("M")) {
		     	qtdhomem++;
			}
			
			if(genero[i].equals("F")){
				qtdmulher++;
			}
		}
			

		 soma = 0;
		 
		for(int i=0; i<n; i++) {
			soma += altura[i];
			
		}
		
		media = soma / n;
		
		System.out.println("Media de tamanho: " + media);
		System.out.println("Maior altura: " + maior);
		System.out.println("Menor altura: " + menor);
		System.out.println("Numero de homens = " + qtdhomem);
		
	  }	
}
