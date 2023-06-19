package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;
import entities.Circle;
import entities.Shape;
import entities.enumerated.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			System.out.println("Shape #" + i + " Data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
	        Color color = Color.valueOf(sc.next()); //Sempre usar o valueOf para predefinir valores ENUM ou para ler de um usuario com o scanner
	        if(ch == 'r') {
	        	System.out.print("Width: ");
		        Double width = sc.nextDouble();
		        System.out.print("Height: ");
		        Double height = sc.nextDouble();
		        list.add(new Rectangle(color, width, height)); //É BOA PRATICA CRIAR O OBJETO DENTRO DA LISTA
			} else {
				System.out.print("Radius: ");
		        Double radius = sc.nextDouble();
		        list.add(new Circle(color, radius));
			}
			
		}
		System.out.println();
		System.out.println("Shape areas: ");
		for(Shape shape : list) {
			System.out.println(shape.area());
		}
	
		sc.close();
		
	}
}
