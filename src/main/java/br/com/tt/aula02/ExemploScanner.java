package br.com.tt.aula02;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		System.out.println("Digite um texto: ");
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();
		scanner.close();
		System.out.println("O texto digitado foi: " + texto);
	}
}
