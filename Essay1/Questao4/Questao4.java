/*Escreva um programa em java que para cada produto informado (nome,preço e quantidade), 
escreva o nome do produto comprado e o valor total a ser pago, considerando que são oferecidos 
descontos pelo número de unidades compradas, segundo a tabela abaixo: (dica: utilize switch case)
• Até 10 unidades: valor total
• de 11 a 20 unidades: 10% de desconto
• de 21 a 50 unidades: 20% de desconto
• acima de 50 unidades: 25% de desconto*/
package org.Questao4;
import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);
		  
		  String nome;
		  float preco;
		  int quant, caso;
		  
		  System.out.println("Informe o nome, o preço e a quantidade do produto, respectivamente:");
		  nome = teclado.next();
		  preco = teclado.nextFloat();
		  quant = teclado.nextInt();
		  caso = 0;
		  System.out.print("Produto "+ nome);
		  
		  if (quant <= 10)
			  caso = 1;
		  
		  if (quant >= 11 & quant <= 20)
			  caso = 2;
		  
		  if (quant >= 21 & quant <= 51)
			  caso = 3;
		  
		  if (quant > 50)
			  caso = 4;
		  
		   switch (caso) {
		   case 1: System.out.print("\n Não há desconto para essa quantidade. O valor final é: "+ preco);
			  break;
		   case 2: float desc = (float) (quant *(preco - 0.1*preco));
		     System.out.print("\n O valor final com desconto é " + desc);
			  break;
		   case 3: float desc1 = (float) (quant *(preco - 0.2*preco));
		     System.out.print("\n O valor final com desconto é " + desc1);
			  break;
		   case 4: float desc2 = (float) (quant *(preco - 0.25*preco));
		     System.out.print("\n O valor final com desconto é " + desc2);
			  break;
			  default: System.out.println("\n Não foi possível calcular seu desconto!");
			  break;
		  }
	}
}
