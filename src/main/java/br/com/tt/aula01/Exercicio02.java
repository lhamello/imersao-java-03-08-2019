package br.com.tt.aula01;

// 2) Fa�a um programa que calcule e imprima a m�dia de 4 notas bimestrais.
// Par�metros
//     - Nota 1: 9.8
//     - Nota 2: 7.1 
//     - Nota 3: 5.3 
//     - Nota 4: 8.7
public class Exercicio02 {

	public static void main(String[] args) {
		float nota1 = 9.8f;
		float nota2 = 7.1f;
		float nota3 = 5.3f;
		float nota4 = 8.7f;
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
//		System.out.println("M�dia = " + media);
		System.out.println(String.format("M�dia = %.2f", media));
	}
}
