package org.Q3;
import java.util.Scanner;

public class Cachorro extends Animal {
	
	static Scanner teclado = new Scanner(System.in);
	static String nomeCao;
	static int idadeCao;

	@Override
	public void som() {
		System.out.println("\nAU AU AU");		
	}

	@Override
	public void movimento() {
		System.out.println("\nCachorro correndo!");		
	}

	@Override
	public void criarAnimal() {
		System.out.println("Insira o nome do Cão: ");
		nomeCao = teclado.nextLine();
		
		System.out.println("Insira a idade do Cão: ");
		idadeCao = teclado.nextInt();
		
	}
	
	

}
