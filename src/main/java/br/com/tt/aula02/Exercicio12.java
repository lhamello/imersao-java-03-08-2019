package br.com.tt.aula02;

public class Exercicio12 {

	public static void main(String[] args) {
		int soma = 0;
		
		// Forma 1
		for (int i = 1; i <= 1000; i++) {
			soma = soma + i;
		}
		
		System.out.println("Soma For = " + soma);
		
		// Forma 2
		
		soma = 0;
		int i = 0;
		
		while (i <= 1000) {
			soma = soma + i;
			i++;
		}
		
		System.out.println("Soma While = " + soma);
		
		// Forma 3
		soma = 0;
		i = 0;
		
		do {
			soma = soma + i;
			i++;
		} while (i <= 1000);
		
		System.out.println("Soma Do While = " + soma);
	}
}
