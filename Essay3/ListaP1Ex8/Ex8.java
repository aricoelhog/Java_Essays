/*
 Crie uma classe chamada NotaFiscal que um software utilize para 
 representar uma nota fiscal em uma loja de pe�as. Uma nota fiscal 
 deve incluir quatro dados como atributos:
 
(a) n�mero da pe�a (string);

(b) descri��o da pe�a (string);

(c) quantidade comprada (inteiro);

Escreva um programa que teste cada um dos m�todos da classe.
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
