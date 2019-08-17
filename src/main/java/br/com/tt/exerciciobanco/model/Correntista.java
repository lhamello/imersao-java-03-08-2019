package br.com.tt.exerciciobanco.model;

public class Correntista {

	private String nome;
	private Conta conta;
	
	public Correntista(String nomeCorrentista, Conta contaCorrentista) {
		this.nome = nomeCorrentista;
		this.conta = contaCorrentista;
	}
	
	@Override
	public String toString() {
		return String.format(" - %s[nome=%s,conta=%s]", 
				"Correntista",
				nome,
				conta);
	}
}
