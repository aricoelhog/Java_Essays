/*
 Crie uma classe MoedaViciada, que simula um cara ou coroa. Seu 
 programa deve ler qual é a opção do usuário (cara ou coroa), 
 e simular a jogada da moeda. No entanto, a opção do usuário só 
 deve ter 30% de chances de ocorrer. Deve haver um método para 
 cada opção. Utilize a classe Random da biblioteca padrão do Java.
 */

package org.ListaP1Ex9;
import java.util.Scanner;
import java.util.Random;

public class MoedaViciada {
	
	static Scanner teclado = new Scanner(System.in);
	static int opcao, lan, resp=0;
	static Random gerador = new Random();
	
	public static void cara() {
		lan = gerador.nextInt(10);
		if (lan < 3)
			System.out.println("Cara!");
		else if (lan >= 3)
			System.out.println("Coroa!");
	}
	
	public static void coroa() {
		lan = gerador.nextInt(10);
		if (lan < 3)
			System.out.println("Coroa!");
		else if (lan >= 3)
			System.out.println("Cara!");
	}
	
	public static void main(String[] args) {
		
		do {
		System.out.println("Insira a opção desejada:\n1-Cara\n2-Coroa");
		opcao = teclado.nextInt();
		
		if (opcao == 1)
			cara();
		else if (opcao == 2)
			coroa();
		else System.out.println("Opção Inválida!");
		
		System.out.println("\nDeseja continuar? \n1-Sim \n0-Nao");
		resp = teclado.nextInt();
		} while (resp == 1);
		
	}
	

}
