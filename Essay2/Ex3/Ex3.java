/*Ordene um vetor de 100 números inteiros gerados 
 aleatoriamente.
 */
package org.Ex3;
import java.util.Arrays;
import java.util.Random;

public class Ex3 {
	static Random gerador = new Random();
	static int i;
	static int[] vet = new int[100]; 
	
	public static void main(String[] args) { 
	
		for (i=0; i < vet.length; i++) 
			vet[i]=gerador.nextInt();
		
	Arrays.sort(vet);
	
	System.out.println("Vetor Ordenado:");
	for (i = 0; i < vet.length; i++) {
		System.out.println(vet[i]);
	}

}
}
