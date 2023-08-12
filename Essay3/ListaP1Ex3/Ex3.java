/*
 Crie um programa que leia o raio de um círculo e imprima seu 
diâmetro, área e circunferência.
Utilize a constante PI definida na classe Math.
 */

package org.ListaP1Ex3;
import java.util.Scanner;

public class Ex3 {
	
	static Scanner teclado = new Scanner(System.in);
	
	static float raio, diametro;
	
	public static void main(String[] args) {
		
		System.out.println("Insira o raio do círculo:");
		raio = teclado.nextFloat();
		
		diametro = 2*raio;
		
		float circ = (float) (raio * 2 * Math.PI);
		
		float area = (float) (Math.PI * Math.pow(raio, 2));
		
		System.out.println("\n Diâmetro: " + diametro + "\n Área: " +area+ "\n Circunferência: " +circ);		
		
	}

}
