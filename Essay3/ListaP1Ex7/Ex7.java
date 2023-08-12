/*
 Crie uma classe chamada Conta, que represente contas bancárias. 
 A classe deve conter como atributo o saldo da conta (um número 
 real). A classe deve possuir um construtor que recebe o saldo 
 inicial para inicializar o atributo, validando se o valor é maior 
 ou igual à zero. Caso o valor seja menor que zero, o atributo 
 deve ser inicializado com zero, e uma mensagem de erro deve ser
apresentada.

Crie um programa que contenha dois objetos desta classe e utilize 
cada um dos três métodos:

(a) credito: adiciona um valor ao saldo atual;

(b) debito: subtrai um valor do saldo atual, garantindo que o 
saldo não ficará negativo. Se o débito for maior que o saldo, 
a operação não deve ser realizada e uma mensagem apresentada;

(c) getSaldo: retorna o saldo.
 */

package org.ListaP1Ex7;
import java.util.Scanner;

public class Ex7 {
	
	static Scanner teclado = new Scanner(System.in);
	static float saldo;
	static Conta conta = new Conta();
	static int resp, opcao;
	
	public static void main(String[] args) {
		
		Conta.Construtor();
		
		do {
			
			System.out.println("Escolha a operação desejada: \n1) Crédito \n2) Débito \n3) Visualizar saldo\n4) Sair do Programa\nQual opção você deseja?");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1: Conta.credito();
			break;
			case 2: Conta.debito();
			break;
			case 3: Conta.getSaldo();
			break;
			case 4: System.exit(0);
			break;
			}
	
		
		
		System.out.println("\nDeseja continuar? \n1-Sim \n0-Nao");
		resp = teclado.nextInt();
		} while (resp == 1);
		
	}

}
