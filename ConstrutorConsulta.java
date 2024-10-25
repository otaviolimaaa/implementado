package Implementado;

public class ConstrutorConsulta {
	public static void main(String[] args) {
		Consulta consulta1 = new Consulta();
		Consulta consulta2 = new Consulta("13/08","Joabe","Mikey");
		Consulta consulta3 = new Consulta ("14/09", "Julio" ,"Gabriel");
		
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomepente());
		System.out.println(consulta1.getNomedente());
		
		System.out.println(consulta2.getData());
		System.out.println(consulta2.getNomepente());
		System.out.println(consulta2.getNomedente());
		
		System.out.println(consulta3.getData());
		System.out.println(consulta3.getNomepente());
		System.out.println(consulta3.getNomedente());


	}}
