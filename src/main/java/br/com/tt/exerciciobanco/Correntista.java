package br.com.tt.exerciciobanco;

public class Correntista {

	private String nome;
	private Conta conta;
	
	public Correntista(String nomeCorrentista, Conta contaCorrentista) {
		this.nome = nomeCorrentista;
		this.conta = contaCorrentista;
	}
}
