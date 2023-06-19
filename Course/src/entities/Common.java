package entities;

public class Common extends TaxPayer {

	
	private Double healthExpenditures;
	
	//NÃO É PRECISO IMPLEMENTAR ATRIBUTOS POIS ELES HERDAM
	//DA CLASSE MÃE
	//ENTÃO O CONSTRUTOR JA ATRIBUI OS ATRIBUTOS;
	
	public Common(String nome, Double rendaAnual, Double healthExpenditures) {
		super(nome, rendaAnual);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}
	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double basicTax;
		if(getRendaAnual() < 20000.0) {
			basicTax = getRendaAnual() * 0.15;
		} else {
			basicTax = getRendaAnual() * 0.25;
		}
		return 0;
	}
	
	

}
