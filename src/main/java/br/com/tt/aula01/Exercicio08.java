package br.com.tt.aula01;

public class Exercicio08 {

	public static void main(String[] args) {
		imprimir('F');
		imprimir('M');
		imprimir('A');
	}
	
	private static void imprimir(char letra) {
		switch (letra) {
		case 'F':
			System.out.println("Feminino");
			break;
		case 'M':
			System.out.println("Masculino");
			break;
		default:
			System.out.println("Sexo inválido.");
			break;
		}
	}
}
