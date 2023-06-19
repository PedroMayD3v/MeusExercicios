package devPedro;
import java.util.Scanner;
import entities.Employee;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
			
	
		System.out.print("Name: ");
		emp.nome = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.salario = sc.nextDouble();
		System.out.print("Taxs: ");
        emp.taxa = sc.nextDouble();
        
        System.out.println();
        System.out.println("Employee: " + emp);
        
        System.out.print("Quantos porcentos acrescentar no salário: ");
        double percentage = sc.nextDouble();
        emp.aumentoSalario(percentage);
        
        System.out.println("Updated data: " + emp); 
		
        sc.close();
	}
	
	

}
