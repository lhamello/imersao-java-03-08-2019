package br.com.tt.aula02;

// F4! = 4 * 3 * 2 * 1
public class Exercicio14 {
	
	private static int fatorial(int n) {
		if (n == 1) {
			return 1;
		}
		
		return n * fatorial(n - 1);
	}
	
	public static void main(String[] args) {
		// forma 1
		for (int fat = 1; fat <= 10; fat++) {
			int multiplicacao = 1;
			
			for (int mult = fat; mult > 0; mult--) {
				multiplicacao = multiplicacao * mult;
			}
			
			System.out.println(String.format("F(%s) = %s", fat, multiplicacao));
		}
		
		// forma 2
		
		int fat2 = 1;
		
		for (int mult2 = 1; mult2 <= 10; mult2++) {
			fat2 = fat2 * mult2;
			System.out.println(String.format("F(%s) = %s", mult2, fat2));
		}
		
		// forma 3 (recursão)
		
		for (int n = 1; n <= 10; n++) {
			System.out.println(String.format("F(%s) = %s", n, fatorial(n)));
		}
	}
}
