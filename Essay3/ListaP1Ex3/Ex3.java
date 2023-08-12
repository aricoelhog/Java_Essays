/*
 Crie um programa que leia o raio de um c�rculo e imprima seu 
di�metro, �rea e circunfer�ncia.
Utilize a constante PI definida na classe Math.
 */

package org.ListaP1Ex3;
import java.util.Scanner;

public class Ex3 {
	
	static Scanner teclado = new Scanner(System.in);
	
	static float raio, diametro;
	
	public static void main(String[] args) {
		
		System.out.println("Insira o raio do c�rculo:");
		raio = teclado.nextFloat();
		
		diametro = 2*raio;
		
		float circ = (float) (raio * 2 * Math.PI);
		
		float area = (float) (Math.PI * Math.pow(raio, 2));
		
		System.out.println("\n Di�metro: " + diametro + "\n �rea: " +area+ "\n Circunfer�ncia: " +circ);		
		
	}

}
