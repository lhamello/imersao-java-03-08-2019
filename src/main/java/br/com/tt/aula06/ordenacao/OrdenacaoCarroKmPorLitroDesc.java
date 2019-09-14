package br.com.tt.aula06.ordenacao;

import java.util.Comparator;

public class OrdenacaoCarroKmPorLitroDesc implements Comparator<Carro> {

	@Override
	public int compare(Carro carro, Carro outroCarro) {
		return outroCarro.getKmPorLitro().compareTo(carro.getKmPorLitro());
	}
}
