package br.com.tt.aula01;

public class Exercicio09 {

	public static void main(String[] args) {
		int valorA = 115;
		int valorB = 231;
		int valorC = 111;
		
		if (valorA > valorB && valorA > valorC) {
			System.out.println("Valor A maior = " + valorA);
		} else if (valorB > valorA && valorB > valorC) {
			System.out.println("Valor B maior = " + valorB);
		} else {
			System.out.println("Valor C maior = " + valorC);
		}
	}
}
