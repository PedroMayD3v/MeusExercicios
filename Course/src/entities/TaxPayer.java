package entities;

public abstract class TaxPayer {
	
	protected String nome;
	protected Double rendaAnual;
	
	public TaxPayer() {
		
	}

	public TaxPayer(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double tax();
	
	//RELAÇÃO É - UM = SUBCLASSES TEM REALÇAO COM  A CLASSE MAE
	//EXEMPLO PEDIDO STATUS É UM PEDIDO;
	//HERANÇA TOTAL É QUANDO UMA CLASSE E SEUS METODOS SÃO ABSTRATOS

}
