/*
 Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), 
 utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os 
 animais fique na classe Animal. Implemente um programa que crie os 3 tipos de animais definidos no exercício
 anterior e invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de 
 animal.
 */

package org.Q3;
import java.util.Scanner;

public abstract class Animal {
	
	static Scanner teclado = new Scanner(System.in);
		
	public abstract void som();
	public abstract void movimento();
	public abstract void criarAnimal();
	
	//instâncias
	static Cachorro dog = new Cachorro();
	static Cavalo horse = new Cavalo();
	static Preguiça lazy = new Preguiça();
	
	public static void main(String[] args) {
		
		dog.criarAnimal();
		dog.som();
		
		horse.criarAnimal();
		horse.som();
		
		lazy.criarAnimal();
		lazy.som();
		
	}
		
	

}
