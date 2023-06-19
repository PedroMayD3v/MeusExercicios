package Entities;

public class Carro {
	
	private String marca;
	private String modelo;
	private int preço;
	private int placa;
	private int multa;
	
	public Carro(String marca, String modelo, Integer preço, Integer placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.preço = preço;
		this.placa = placa;
		this.multa = multa;
	}
	public Carro() {
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPreço() {
		return preço;
	}
	public int setPreço(int preço) {
		return this.preço = preço;
	}
	public Integer getPlaca() {
		return placa;
	}
	public void setPlaca(Integer placa) {
		this.placa = placa;
	}
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", preço=" + preço + ", placa=" + placa + "]";
	}
	
	public static int multa(Integer preço, Integer multa) {
	 return multa = multa + preço;
	}
	
	

}
