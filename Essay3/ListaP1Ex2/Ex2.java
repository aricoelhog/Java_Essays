/*
 Crie um programa que leia dois inteiros e determine se o primeiro 
 � um m�ltiplo do segundo.
 */

package org.ListaP1Ex2;
import java.util.Scanner;

public class Ex2 {
	
	static Scanner teclado = new Scanner(System.in);
	
	static int num1, num2, resto;
	
	public static void main(String[] args) {
		
		System.out.println("Insira o primeiro n�mero:");
		num1 = teclado.nextInt();
		
		System.out.println("\nInsira o segundo n�mero:");
		num2 = teclado.nextInt();
		
		resto = num1 % num2;
		
		if (resto == 0)
			System.out.println("\n O n�mero "+ num1 + " � m�ltiplo de " + num2);
		else System.out.println("\n O n�mero "+ num1 + " n�o � m�ltiplo de " + num2);
		
	}

}
