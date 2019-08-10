package br.com.tt.aula02;

public class Exercicio13 {

	public static void main(String[] args) {
		// forma 1
		for (int i = 3; i <= 100; i = i + 3) {
			System.out.println(i);
		}
		
		// forma 2
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
