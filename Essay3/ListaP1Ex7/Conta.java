package org.ListaP1Ex7;
import java.util.Scanner;

public class Conta {
	
	static Scanner teclado = new Scanner(System.in);
	static float saldo, cred, deb;
	
	public static void Construtor() {
		
		System.out.println("Insira o valor do saldo:");
		saldo = teclado.nextFloat();
		
		if (saldo >= 0)
			System.out.println("Saldo Válido!");
		else {
			System.out.println("Saldo Inválido!");
			saldo = 0;
		}
		}
	
	public static void credito () {
		System.out.println("CRÉDITO: Insira o valor a ser adicionado:");
		cred = teclado.nextFloat();
		saldo = saldo + cred;
		System.out.println("Operação realizada com sucesso! Saldo atual:" +saldo);
	}
	
	public static void debito () {
		System.out.println("DÉBITO: Insira o valor a ser subtraído:");
		deb = teclado.nextFloat();
		if (deb <= saldo) {
			saldo = saldo - deb;
			System.out.println("Operação realizada com sucesso! Saldo atual:" +saldo);
		} else System.out.println("Saldo insuficiente!");
			
	}
	
	public static void getSaldo() {
		System.out.println("Saldo atual: " +saldo);
	}
	

}
