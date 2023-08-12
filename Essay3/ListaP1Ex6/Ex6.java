/*
 Crie um programa que aloque dinamicamente e leia uma matriz 10x10 
 de caracteres e, atrav�s de um m�todo est�tico, imprima todos os 
 elementos, exceto os da diagonal secund�ria.
 */


package org.ListaP1Ex6;
import java.util.Scanner;

public class Ex6 {
	
	static Scanner teclado = new Scanner(System.in);
	static char[][] matriz = new char[10][10];
	static int i, j;
	static int N = matriz.length;
	
	public static void main(String[] args) {
				
		for (i=0; i< N; i++) {
			for (j=0; j< N; j++) {
				System.out.println("Insira o caract�r: ");
				matriz[i][j]= teclado.next().charAt(0);
			}
		}
		
		System.out.println("Matriz sem a diagonal secund�ria: ");
		
		for (i=0; i< N; i++) {
			for (j= N-1; j >= 0; j--) {
				if (i != N - j - 1 )
					System.out.println(matriz[i][j]);
			}
		}
		
	}

}
