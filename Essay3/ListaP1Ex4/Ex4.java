/*
 Crie um programa que leia um caractere e o imprima na tela, 
 juntamente com seu código na tabela ASCII, que deve ser determinado em tempo de execução.
 */

package org.ListaP1Ex4;
import java.util.Scanner;

public class Ex4 {
	
	static Scanner teclado = new Scanner(System.in);
	static char ch;
	
	public static void main(String[] args) {
		
		System.out.println("Digite um caracter: ");
	    ch = teclado.next().charAt(0);
	    int ascii = (int) (ch);
	    System.out.println("\nCaracter digitado:" +ch+ "\nCodigo ASCII: " +ascii);
	    
	}

}
