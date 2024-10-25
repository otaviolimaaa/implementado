package Implementado;

public class Consulta {
	private static final float Nomepente = 0;
	private String data;
	private String  nomepente;
	private String nomedente;
	
	//Construtor padrão é criado mesmo que nao explicitado
	public Consulta () {
		}
	//método construtor com argumento
	public Consulta(String data) {
		this.data = data;
	}
public Consulta (String data  ,String nomepente, String nomedente) {
	this.data = data;
	this.nomepente = nomedente;
}
public String getData () {
	return data;
}
public void setData (String Data, String data) {
	this.data = data;
}
public float getNomepente () {
	return  Nomepente;
}
public void setNomepente (String nomepente) {
	this.nomepente = nomepente ;
}
public char[] getNomedente() {
	// TODO Auto-generated method stub
	return null;
}
}


