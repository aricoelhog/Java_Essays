/*Escreva um programa em java que leia dois pontos num espa�o de duas 
dimens�es (a, b), e calcule sua dist�ncia. */
package org.Questao3;
import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);
		  
		  float a,b,dist;
		  System.out.print("Informe a posi��o dos pontos no espa�o: ");
		  a = teclado.nextFloat();
		  b = teclado.nextFloat();
		  
		  if (a > b || a == b) 
			  dist = a-b;
		  else 
			  dist = b - a;
		  
		  System.out.print("A dist�ncia � igual a "+ dist);
		  
	}
}
