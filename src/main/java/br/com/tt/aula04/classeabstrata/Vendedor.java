package br.com.tt.aula04.classeabstrata;

public class Vendedor extends Empregado {

	private Double comissao;
	
	public Vendedor(String nome, String email, int idade, Double comissao) {
		super(nome, email, idade);
		this.comissao = comissao;
	}	
	
	@Override
	public Double calcularRendimentos() {
		return comissao * 8;
	}

	@Override
	public void salvar() {
		System.out.println("Vendedor salvo!");
	}
}
