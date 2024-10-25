package Implementado;

public class Animal {
	private String Cor;
	private float Tamanho ;

	// Construtor padrão é criado mesmo que nao explicitado
	public Animal() {
	}

	// método construtor com argumento
	public Animal(String cor) {
		this.Cor = cor;
	}

	public Animal(String cor, float tamanho) {
		this.Cor = Cor;
		this.Tamanho = Tamanho;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String Cor) {
		this.Cor = Cor;
	}

	public float getTamanho() {
		return Tamanho;
	}

	public void setIdade(float Tamanho) {
		this.Tamanho = Tamanho;
	}
}
