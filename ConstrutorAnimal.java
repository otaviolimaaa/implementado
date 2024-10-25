package Implementado;

public class ConstrutorAnimal {
	public static void main(String[] args) {
		Animal animal1 = new Animal("Grande", 43.00f);
		Animal animal2 = new Animal("Pequeno" , 67.00f);
		Animal animal3 = new Animal("Médio", 45.00f);
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
		System.out.println(animal2.getTamanho());
		System.out.println(animal2.getCor());
		System.out.println(animal3.getTamanho());
		System.out.println(animal3.getCor());

}}


