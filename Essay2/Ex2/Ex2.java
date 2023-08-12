/*Leia do usuário o tempo em segundos e escreva em 
 horas, minutos e segundos. Utilize cinco métodos,
 para a leitura e escrita de dados e para
obtenção de horas, minutos e segundos a partir 
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
	
		
	//Cálculo Minutos
	public static int CalcMinutos (int min) {
		return (min / 60);
	}
	
	//Cálculo Horas
	public static int CalcHoras(int minutos) {
		return (minutos / 60);
	}
	
	public static void printf2 () {
		System.out.println("Os segundos introduzidos em horas são "+ hora + "hrs \nEm minutos: " + minutos + "min \nEm Segundos: " + seg +"seg");
		
	}
	
	public static void main(String[] args) {
		
		printf1();
		seg = entradaSegundos();
		minutos = CalcMinutos(seg);
		hora = CalcHoras(minutos);
		printf2();
		
	}

}
