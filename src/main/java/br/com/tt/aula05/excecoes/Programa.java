package br.com.tt.aula05.excecoes;

public class Programa {

	public static void main(String[] args) throws PosicaoInvalidaException {
		ImprimePosicao imprime = new ImprimePosicao();
		System.out.print("Chamada Posi��o 0: ");
		imprime.imprimirPosicao(0);
		System.out.println();
		
		System.out.print("Chamada Posi��o 1: ");
		imprime.imprimirPosicao(1);
		System.out.println();
		
		System.out.print("Chamada Posi��o 2: ");
		imprime.imprimirPosicao(2);
		System.out.println();
		
		System.out.print("Chamada Posi��o 3: ");
		imprime.imprimirPosicao(3);
		System.out.println();
		
		System.out.println("PROGRAMA ENCERRADO!!!");
	}
}
