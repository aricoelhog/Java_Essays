/*
 Crie um programa que armazene 12 números em um array e determine 
 qual a porcentagem de números menores que 8 e qual a porcentagem 
 de números maiores que 10.
 */

package org.Q1;
import java.util.Scanner;

public class Q1 {
	
	static Scanner teclado = new Scanner(System.in);
	static int[] array = new int[12];
	static float[] MenorQue8 = new float[12];
	static float[] MaiorQue10 = new float[12];
	static float soma1, soma2, Porc1, Porc2;
	static int i; 
	
	public static void main(String[] args) {
		
		for (i=0; i< array.length; i++) {
		System.out.println("Digite o número: ");
		array[i] = teclado.nextInt();
		
		if (array[i] < 8) {
			MenorQue8[i] = 1;
			MaiorQue10[i] = 0;		
		}else if (array[i] > 10) {
			MenorQue8[i] = 0;
			MaiorQue10[i] = 1;		
		}		
		
		soma1 += MenorQue8[i];
		soma2 += MaiorQue10[i];
		
		}
		
		Porc1 = soma1 * 100/12;
		Porc2 = soma2 * 100/12;
		
		System.out.println("\nA porcentagem de números menores que 8 é de:" +Porc1+ "% e a porcentagem de números maiores que 10 é de:" +Porc2+ "%");
		
	}

}
