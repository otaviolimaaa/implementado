package Implementado;

public class Carro {
	

	private String placa;
	private int chassi;
	
	
	public Carro() {
		}
	//método construtor com argumento
	public Carro (String placa) {
		this.placa = placa;
	}
public Carro (String placa,int chasi, int chassi) {
	this.placa = placa;
	this.chassi = chassi;
}
public String getPlaca () {
	return placa;
}
public void setPlaca (String nome, String placa) {
	this.placa = placa;
}
public int getChassi () {
	return chassi;
}
public void setChassi (int Chassi, int chassi) {
	this.chassi = chassi;
}
}

