package org.ListaP1Ex7;
import java.util.Scanner;

public class Conta {
	
	static Scanner teclado = new Scanner(System.in);
	static float saldo, cred, deb;
	
	public static void Construtor() {
		
		System.out.println("Insira o valor do saldo:");
		saldo = teclado.nextFloat();
		
		if (saldo >= 0)
			System.out.println("Saldo V�lido!");
		else {
			System.out.println("Saldo Inv�lido!");
			saldo = 0;
		}
		}
	
	public static void credito () {
		System.out.println("CR�DITO: Insira o valor a ser adicionado:");
		cred = teclado.nextFloat();
		saldo = saldo + cred;
		System.out.println("Opera��o realizada com sucesso! Saldo atual:" +saldo);
	}
	
	public static void debito () {
		System.out.println("D�BITO: Insira o valor a ser subtra�do:");
		deb = teclado.nextFloat();
		if (deb <= saldo) {
			saldo = saldo - deb;
			System.out.println("Opera��o realizada com sucesso! Saldo atual:" +saldo);
		} else System.out.println("Saldo insuficiente!");
			
	}
	
	public static void getSaldo() {
		System.out.println("Saldo atual: " +saldo);
	}
	

}
