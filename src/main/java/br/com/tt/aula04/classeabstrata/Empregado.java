package br.com.tt.aula04.classeabstrata;

public abstract class Empregado {

	protected String nome;
	protected String email;
	protected int idade;
	
	public Empregado(String nome, String email, int idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	
	public abstract Double calcularRendimentos();

	public abstract void salvar();

	public int getIdade() {
		return idade;
	}
}
