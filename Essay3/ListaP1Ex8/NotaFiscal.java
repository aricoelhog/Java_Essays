package org.ListaP1Ex8;
import java.util.Scanner;

public class NotaFiscal {
	
	static Scanner teclado = new Scanner(System.in);
	static String numPeca, DescPeca;
	static int QuantComp;
	
	public static void NumPeca () {
		System.out.println("\nInsira o número da peça:");
		numPeca = teclado.next();
		
	}
	
	public static void DescPeca() {
		System.out.println("\nInsira a descrição da peça:");
		DescPeca = teclado.next();
		
	}
	
	public static void QuantComp() {
		System.out.println("\nInsira a quantidade de peças:");
		QuantComp = teclado.nextInt();
	}
	
	public static void gerador() {
		System.out.println("Nota fiscal:\nNúmero da peça: " +numPeca+"\nDescrição da Peça: " +DescPeca+"\nQuantidade Comprada: "+QuantComp);
	}

}
