/*
 Crie um programa que leia 3 inteiros a partir do teclado e determina:
(a) o maior;
(b) o menor;
(c) o produto;
(d) a m�dia.
 */


package org.ListaP1Ex1;
import java.util.Scanner;
import java.util.Arrays;

public class Ex1 {
	
	static Scanner teclado = new Scanner(System.in);
	
	static int[] numeros = new int[3];
	static int maior, menor, produto, i, m;
	static float media;
	
	public static void main(String[] args) {
		
		for(i=0; i < numeros.length; i++) {
			
			System.out.println("Insira o n�mero: ");
			numeros[i] = teclado.nextInt();
			}

		Arrays.sort(numeros);
			
		maior = numeros[2];
			
		menor = numeros[0];
	      
	    produto = numeros[0]*numeros[1] * numeros[2];
	    
	    float soma = (float) (numeros[0] + numeros[1] + numeros[2]);
	    
	    media = soma/3;
	   	   
	    
		System.out.println("\n O maior n�mero �: " + maior + "\n O menor n�mero �: " + menor + "\n O produto �: " + produto + "\n A m�dia �: " + media);
		
		}

}
