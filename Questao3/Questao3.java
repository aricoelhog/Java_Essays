/*Escreva um programa em java que leia dois pontos num espaço de duas 
dimensões (a, b), e calcule sua distância. */
package org.Questao3;
import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);
		  
		  float a,b,dist;
		  System.out.print("Informe a posição dos pontos no espaço: ");
		  a = teclado.nextFloat();
		  b = teclado.nextFloat();
		  
		  if (a > b || a == b) 
			  dist = a-b;
		  else 
			  dist = b - a;
		  
		  System.out.print("A distância é igual a "+ dist);
		  
	}
}
