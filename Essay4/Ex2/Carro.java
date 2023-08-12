package org.Ex2;

import java.util.Scanner;

public class Carro extends Transporte {
	
	static int quilometragem;
	static Scanner teclado = new Scanner(System.in);
	
	static void getKm() {
		System.out.println("\n Quilometragem: "+quilometragem);
	}
	
	static void setKm(int km) {
		if (km >= 0)
			quilometragem = km;
		else if (km < 0 | km > 999999) { 
			System.out.println(" Velocidade inválida!");
		}		
		}
	
	public static void main(String[] args) {
		
		liga();
		setVel((int) 120);
		setKm((int) 12000);
		getKm();
		getVel();
		desliga();
		
	}
	
	

}
