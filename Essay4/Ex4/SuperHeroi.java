package org.Ex4;
import org.Ex4.Humano.humano;
import org.Ex4.Inseto.inseto;
import java.util.Scanner;

public class SuperHeroi implements humano, inseto {
	
	static String codinome, trauma, poderes;
	static String superH;
	static Scanner teclado = new Scanner(System.in);
	static Humano human = new Humano();
	static Inseto insect = new Inseto();
	static SuperHeroi hero = new SuperHeroi();
	
    public String toString() {
        return super.toString()
                + " (Codinome: " + codinome
                + ", Trauma: " + trauma
                + ", Poderes: " + poderes
                + ")\n"
                ;
    }
	
	public static void construtor() {
		String homem = human.toString();
		String bicho = insect.toString();
		String superheroi = hero.toString();
		
		superH = superheroi.concat(homem).concat(bicho);
		
	}
	
	public static void print() {
		
		System.out.println("Um novo super herói surge! \n"+superH);
	}
	
		
		
		public static void main(String[] args) {
			
			construtor();
			print();
			
		}

		

		

		
		
	}


