package br.com.tt.aula01;

// 4) Fa�a o programa que, dado o raio de um c�rculo, calcule e imprima sua �rea.
// Par�metros
//     - Raio: 7
//     - Pi: 3,1415926
//     - F�rmula: pi*R^2
public class Exercicio04 {

	public static void main(String[] args) {
		double raio = 7;
		double pi = 3.1415926;
		
		// Forma 1
		System.out.println(pi * (raio * raio));
		
		// Forma 2
		System.out.println(Math.PI * Math.pow(raio, 2));
	}
}
