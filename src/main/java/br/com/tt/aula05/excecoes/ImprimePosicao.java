package br.com.tt.aula05.excecoes;

public class ImprimePosicao {

	public void imprimirPosicao(int posicao) throws PosicaoInvalidaException {
		try {
			int[] array = { 1, 2, 3 };
			System.out.println(array[posicao]);
		} catch (ArrayIndexOutOfBoundsException excecao) {
			System.out.print("Posição inválida.");
			throw new PosicaoInvalidaException();
		}
	}
}
