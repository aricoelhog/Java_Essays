package org.Ex2;

public class Teste {
	
	public static void main(String[] args) {
		Equal.isEqualTo(0.236, 0.237);
		Equal.isEqualTo(0.236, 0.236);
		Equal.isEqualTo(2, 3);
		Equal.isEqualTo(4, 4);
		Equal.isEqualTo('c','b');
		Equal.isEqualTo('c','c');
		Equal.isEqualTo("lola", "lolo");
		Equal.isEqualTo("lola", "lola");
		Equal.isEqualTo((Object) 2, (Object) 3);
		Equal.isEqualTo((Object) 2, (Object) 2);
	}

}
