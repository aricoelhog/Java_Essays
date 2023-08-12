package org.Ex2;

public class Transporte {
	
	static boolean ligado;
	static int velocidade;
	
	static void liga () {
		ligado = true;
	}
	
	static void desliga () {
		ligado = false;
		velocidade = 0;
	}
	
	static void getVel() {
		System.out.println("\n Velocidade: "+velocidade);
	}
	
	static void setVel(int vel) {
		if (vel >= 0)
			velocidade = vel;
		else if (vel < 0 | vel > 200){ 
			System.out.println(" Velocidade inválida!");
			}		
	}
	
	

}
