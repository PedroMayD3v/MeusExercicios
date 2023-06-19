package entities;

public class Compania extends TaxPayer {

	protected String companyName;
	protected Double anualIncome;
	protected Integer numberEmployee;
	
	public Compania(String nome, Double rendaAnual, String companyName, Double anualIncome, Integer numberEmployee) {
		super(nome, rendaAnual);
		this.companyName = companyName;
		this.anualIncome = anualIncome;
		this.numberEmployee = numberEmployee;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}
	
	
	
	
	
}
