/*Ordene um vetor de 50 números inteiros gerados 
 aleatoriamente.
 */
package org.Q2;
import java.util.Arrays;
import java.util.Random;

public class Q2 {
	static Random gerador = new Random();
	static int i;
	static int[] vet = new int[50]; 
	
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
