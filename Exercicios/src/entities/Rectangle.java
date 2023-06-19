package entities;

public class Rectangle {
	
	public double altura;
	public double largura;
	
	public double area() {
		return altura * largura;
		
	}

	public double perimeter() {
		return 2 * (altura + largura);
		
	}
	
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
		
	}
}


