/*
 Crie uma classe chamada NotaFiscal que um software utilize para 
 representar uma nota fiscal em uma loja de peças. Uma nota fiscal 
 deve incluir quatro dados como atributos:
 
(a) número da peça (string);

(b) descrição da peça (string);

(c) quantidade comprada (inteiro);

Escreva um programa que teste cada um dos métodos da classe.
 */


package org.ListaP1Ex8;
import java.util.Scanner;

public class Ex8 {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		NotaFiscal.NumPeca();
		NotaFiscal.DescPeca();
		NotaFiscal.QuantComp();
		NotaFiscal.gerador();
		
	}
}
