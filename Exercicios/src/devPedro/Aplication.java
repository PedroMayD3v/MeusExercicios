package devPedro;
import java.util.Scanner;
import entities.Rectangle;

public class Aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.println("Digite a altura e largura do retangulo: ");
		rect.altura = sc.nextDouble();
		rect.largura = sc.nextDouble();
		
		System.out.println("AREA: " + rect.area());
        System.out.println("PERIMETER: " + rect.perimeter());
        System.out.println("DIAGONAL: " + rect.diagonal());
        
        sc.close();
	}
	

}
