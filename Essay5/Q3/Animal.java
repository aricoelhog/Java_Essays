/*
 Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), 
 utilize os seus conhecimentos e distribua as caracter�sticas de forma que tudo o que for comum a todos os 
 animais fique na classe Animal. Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
 anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto �, independente do tipo de 
 animal.
 */

package org.Q3;
import java.util.Scanner;

public abstract class Animal {
	
	static Scanner teclado = new Scanner(System.in);
		
	public abstract void som();
	public abstract void movimento();
	public abstract void criarAnimal();
	
	//inst�ncias
	static Cachorro dog = new Cachorro();
	static Cavalo horse = new Cavalo();
	static Pregui�a lazy = new Pregui�a();
	
	public static void main(String[] args) {
		
		dog.criarAnimal();
		dog.som();
		
		horse.criarAnimal();
		horse.som();
		
		lazy.criarAnimal();
		lazy.som();
		
	}
		
	

}
