package org.Ex3;

public class Teste {
	
	static SomeException object;
	
	public static void main(String[] args) {
				
		try {
			object = new SomeException();
		} catch (Exception e){
			e.printStackTrace(System.out);			
		}
				
	}

}
