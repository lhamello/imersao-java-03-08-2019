package br.com.tt.aula01;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = false;
		System.out.println("A and B = " + (a && b));
		System.out.println("A or B  = " + (a || b));
		System.out.println("A xor B = " + (a ^ b));
		System.out.println("not A   = " + (!a));
		
		a = true;
		b = false;
		System.out.println();
		System.out.println("A and B = " + (a && b));
		System.out.println("A or B  = " + (a || b));
		System.out.println("A xor B = " + (a ^ b));
		System.out.println("not A   = " + (!a));
		
		a = false;
		b = true;
		System.out.println();
		System.out.println("A and B = " + (a && b));
		System.out.println("A or B  = " + (a || b));
		System.out.println("A xor B = " + (a ^ b));
		System.out.println("not A   = " + (!a));
		
		a = true;
		b = true;
		System.out.println();
		System.out.println("A and B = " + (a && b));
		System.out.println("A or B  = " + (a || b));
		System.out.println("A xor B = " + (a ^ b));
		System.out.println("not A   = " + (!a));
		
		a = false;
		b = true;
		boolean teste = a 
				& 
				b;
		System.out.println(teste);
		
		teste = a 
				&& 
				b;
		System.out.println(teste);
	}
}
