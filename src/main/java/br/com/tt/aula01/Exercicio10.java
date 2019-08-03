package br.com.tt.aula01;

public class Exercicio10 {

	public static void main(String[] args) {
		imprimirEmOrdem(1, 2, 3);
		imprimirEmOrdem(1, 3, 2);
		imprimirEmOrdem(2, 1, 3);
		imprimirEmOrdem(2, 3, 1);
		imprimirEmOrdem(3, 2, 1);
		imprimirEmOrdem(3, 1, 2);
	}
	
	private static void imprimirEmOrdem(int valorA, int valorB, int valorC) {
		if ((valorA > valorB && valorA > valorC) && valorB > valorC) {
			System.out.println(String.format("A=%s > B=%s > C=%s", valorA, valorB, valorC));
		} else if ((valorA > valorB && valorA > valorC) && valorC > valorB) {
			System.out.println(String.format("A=%s > C=%s > B=%s", valorA, valorC, valorB));
		} else if ((valorB > valorA && valorB > valorC) && valorA > valorC) {
			System.out.println(String.format("B=%s > A=%s > C=%s", valorB, valorA, valorC));
		} else if ((valorB > valorA && valorB > valorC) && valorC > valorA) {
			System.out.println(String.format("B=%s > C=%s > A=%s", valorB, valorC, valorA));
		} else if ((valorC > valorA && valorC > valorB) && valorA > valorB) {
			System.out.println(String.format("C=%s > A=%s > B=%s", valorC, valorA, valorB));
		} else {
			System.out.println(String.format("C=%s > B=%s > A=%s", valorC, valorB, valorA));
		}
	}
}
