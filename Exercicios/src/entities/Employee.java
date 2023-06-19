package entities;

public class Employee {
  public String nome;
  public double salario;
  public double taxa;
  
  public double netSalario() {
	  return salario - taxa;
	
  }
	
  public double aumentoSalario(double porcentagem) {
	   return salario += salario / 100.0;
	   
  }
  
  public String toString() {
	  return nome + " , $ " + netSalario();
	  
  }
  
	
}
