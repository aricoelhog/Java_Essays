package org.Ex3;

public class Conta {
	
	static private float saldo;
	
	public Conta(float saldo) {
		this.saldo = saldo;
	}
	
	static void depositar(float dep) {
		saldo = (saldo + dep);
	}
	
	static void sacar(float saque) {
		saldo = (saldo - saque);
	}
	
	static void getSaldo() {
		System.out.println("\n Saldo da Conta Poupança: "+saldo);
	}
	
	static void setSaldo(float sd) {
		if (sd >= 0)
			saldo = sd;
		else { 
			System.out.println(" Saldo inválido!");
		}		
		}
	
	

}
