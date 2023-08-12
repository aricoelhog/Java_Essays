package org.Ex7;

public class Programa {
	
	static int resp = 0;
	static SomeException object;
		
	public static void metodo() throws ArithmeticException, Exception {
		
		try {
			resp = 2/0;
		} catch (ArithmeticException a) {
			a.printStackTrace(System.out);
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			metodo();
			object = new SomeException();
		} catch (Exception e){
			e.printStackTrace(System.out);			
		}
				
	}

}
