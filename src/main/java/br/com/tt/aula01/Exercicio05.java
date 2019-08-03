package br.com.tt.aula01;

// 5) Faça um programa que, dado uma temperatura em graus Farenheit, transforme a temperatura em graus Celcius e imprima o resultado.
// Parâmetros
//     - temperatura Farenheit: 89.6
//     - Fórmula: C = (5 * (F-32) / 9)
public class Exercicio05 {

	public static void main(String[] args) {
		float grausF = 89.6f;
		System.out.println((5 * (grausF - 32) / 9));
	}
}
