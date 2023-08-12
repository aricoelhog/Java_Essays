package org.Ex1;
import java.util.Scanner;

public class EquipamentoSonoro extends Equipamento {
	
	Scanner teclado = new Scanner(System.in);
	
	static short volume;
	static boolean stereo;
		
	static void getVol () {
		System.out.println("\n Volume: "+volume);
	}
	
	static void setVol (short volume) {
		EquipamentoSonoro.volume = volume;
		if (volume < 0 | volume > 10) {
			System.out.println("Volume inválido!");
			volume = 1;
		}
	}
	
	static void mono () {
		stereo = false;
	}
	
	static void stereo () {
		stereo = true;
	}
	
	public static void main(String[] args) {
		
		Equipamento.liga();
		
		if (Equipamento.ligado == true) {
			System.out.println("Ligado");
			setVol((short) 5);
			getVol();
		}			
		
	}

}
