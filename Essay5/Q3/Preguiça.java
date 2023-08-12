package org.Q3;

public class Preguiça extends Animal{
	
	static String nomePreg;
	static int idadePreg;
	
	@Override
	public void som() {
		System.out.println("\nAAAHHRREE");		
	}

	@Override
	public void movimento() {
		System.out.println("\nPreguica subindo na árvore!");		
	}

	@Override
	public void criarAnimal() {
		System.out.println("Insira o nome da Preguiça: ");
		nomePreg = teclado.next();
		
		System.out.println("Insira a idade da Preguiça: ");
		idadePreg = teclado.nextInt();
		
	}

}
