/*Leia do usu�rio o tempo em segundos e escreva em 
 horas, minutos e segundos. Utilize cinco m�todos,
 para a leitura e escrita de dados e para
obten��o de horas, minutos e segundos a partir 
do tempo em segundos.
 */
package org.Ex2;
import java.util.Scanner;

public class Ex2 {
	static Scanner teclado = new Scanner(System.in);
	
	static int seg, minutos, hora;
	
	
	public static void printf1 () {
		System.out.println("Insira o tempo em segundos: ");
		
	}
	
	//Leitura dos Segundos a serem calculados
	public static int entradaSegundos() {
		int segundos = teclado.nextInt();
		return segundos;
	}
	
		
	//C�lculo Minutos
	public static int CalcMinutos (int min) {
		return (min / 60);
	}
	
	//C�lculo Horas
	public static int CalcHoras(int minutos) {
		return (minutos / 60);
	}
	
	public static void printf2 () {
		System.out.println("Os segundos introduzidos em horas s�o "+ hora + "hrs \nEm minutos: " + minutos + "min \nEm Segundos: " + seg +"seg");
		
	}
	
	public static void main(String[] args) {
		
		printf1();
		seg = entradaSegundos();
		minutos = CalcMinutos(seg);
		hora = CalcHoras(minutos);
		printf2();
		
	}

}
