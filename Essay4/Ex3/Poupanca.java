package org.Ex3;

public class Poupanca extends Conta{
	
	public Poupanca(float saldo) {
		super(saldo);
	}

	static int diaRendimento;
	static float saldo;
	
	static void setDiaRend (int day) {
		if (day > 0 & day < 32)
			diaRendimento = day;
		else System.out.println("Dia Inválido!");
	}
	
	static void getDiaRend () {
		System.out.println("\n Dia do Rendimento: "+diaRendimento);
	}
	
	

}
