package org.Ex4;

public class Humano {
	
	protected static String nome, sexo, lingua, etnia;
	protected static int idade;
	
	public String toString()
	{
	    return super.toString ()
	        + " (Nome: " + nome
	        + ", Sexo: " + sexo
	        + ", Lingua: "+lingua
	        +", Etnia:"+etnia
	        +", idade: "+idade
	        +")\n"
	    ;
	}
	
	public interface humano {
		
		
	}

}
