package org.Q3;

public class Pregui�a extends Animal{
	
	static String nomePreg;
	static int idadePreg;
	
	@Override
	public void som() {
		System.out.println("\nAAAHHRREE");		
	}

	@Override
	public void movimento() {
		System.out.println("\nPreguica subindo na �rvore!");		
	}

	@Override
	public void criarAnimal() {
		System.out.println("Insira o nome da Pregui�a: ");
		nomePreg = teclado.next();
		
		System.out.println("Insira a idade da Pregui�a: ");
		idadePreg = teclado.nextInt();
		
	}

}
