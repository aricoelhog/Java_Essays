package org.Ex4;

public class Inseto {	
	
	protected static String nome;	
	protected static boolean venenoso, alado, ferrao;
	
	public String toString()
	{
	    return super.toString ()
	        + " (Nome: " + nome
	        + ", Venenoso: " + venenoso
	        + ", Alado: "+alado
	        + ", Ferrão: "+ferrao
	        +")"
	    ;
	}
	
	public static interface inseto {
		
		}
	
}
