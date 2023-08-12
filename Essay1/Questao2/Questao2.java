/*2-Escreva um programa em java leia os valores de a, b e c e determine as
raízes de uma equação de segundo grau: ax^2 + bx + c = 0. (recordar que o
discriminante delta = b^2 - 4ac, e que a raiz r = (-b+-raiz de delta/2a).*/
package org.Questao2;
import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);
		  int a, b, c, delta;
		  System.out.print("Informe os valores a, b e c da expressão ax^2 + bx + c = 0: ");
		    a = teclado.nextInt();
		    b = teclado.nextInt();
		    c = teclado.nextInt();

		    delta = (b*b) - (4*a*c);
		    if (delta>=0) {
		    	float r1 = (float)((-b + Math.sqrt(delta))/2*a);
		    	float r2 = (float)(-((+b - Math.sqrt(delta))/2*a));
		        System.out.println("Primeira Raiz: " + r1);
		        System.out.println("Segunda Raiz: " + r2);
		        }
		         else System.out.println("Não existe raiz real!");

		}
}
