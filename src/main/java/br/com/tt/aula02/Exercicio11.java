package br.com.tt.aula02;

public class Exercicio11 {

	public static void main(String[] args) {
		// Forma 1
		System.out.println("=========================");
		
		for (int i = 150; i <= 300; i++) {
			System.out.println(i);
		}
		
		System.out.println("=========================");
		// Forma 2
		int i = 150;
		
		while (i <= 300) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("=========================");
		
		// Forma 3
		i = 150;
		do {
			System.out.println(i);
			i++;
		} while (i <= 300);
	}
}
