package br.com.tt.aula06.ordenacao.exercicio;

public class Pessoa implements Comparable<Pessoa> {

	private String id;
	private String nome;
	
	public Pessoa(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return String.format("Pessoa[id=%s,nome=%s]", id, nome);
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		return this.nome.compareTo(outraPessoa.nome);
	}
}
