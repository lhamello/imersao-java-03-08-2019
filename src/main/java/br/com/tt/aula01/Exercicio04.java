package br.com.tt.aula01;

// 4) Faça o programa que, dado o raio de um círculo, calcule e imprima sua área.
// Parâmetros
//     - Raio: 7
//     - Pi: 3,1415926
//     - Fórmula: pi*R^2
public class Exercicio04 {

	public static void main(String[] args) {
		double raio = 7;
		System.out.println(Math.PI * Math.pow(raio, 2));
	}
}
