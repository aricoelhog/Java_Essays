package org.ListaP1Ex8;
import java.util.Scanner;

public class NotaFiscal {
	
	static Scanner teclado = new Scanner(System.in);
	static String numPeca, DescPeca;
	static int QuantComp;
	
	public static void NumPeca () {
		System.out.println("\nInsira o n�mero da pe�a:");
		numPeca = teclado.next();
		
	}
	
	public static void DescPeca() {
		System.out.println("\nInsira a descri��o da pe�a:");
		DescPeca = teclado.next();
		
	}
	
	public static void QuantComp() {
		System.out.println("\nInsira a quantidade de pe�as:");
		QuantComp = teclado.nextInt();
	}
	
	public static void gerador() {
		System.out.println("Nota fiscal:\nN�mero da pe�a: " +numPeca+"\nDescri��o da Pe�a: " +DescPeca+"\nQuantidade Comprada: "+QuantComp);
	}

}
