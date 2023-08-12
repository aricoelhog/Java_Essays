package org.Q3;

public class Cavalo extends Animal{
	
	static String nomeCav;
	static int idadeCav;
	
	@Override
	public void som() {
		System.out.println("\nHINN IN IN");		
	}

	@Override
	public void movimento() {
		System.out.println("\nCavalo correndo!");		
	}

	@Override
	public void criarAnimal() {
		System.out.println("Insira o nome do Cavalo: ");
		nomeCav = teclado.nextLine();
		
		System.out.println("Insira a idade do Cavalo: ");
		idadeCav = teclado.nextInt();
		
	}

}
