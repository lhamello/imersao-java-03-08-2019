package br.com.tt.aula04.classeabstrata;

public class Instrutor extends Empregado {
	
	private int horasTrabalhadas;
	
	public Instrutor(String nome, String email, int idade, int horasTrabalhadas) {
		super(nome, email, idade);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public Double calcularRendimentos() {
		return horasTrabalhadas * 35.00;
	}

	@Override
	public void salvar() {
		System.out.println("Instrutor salvo!");
	}
}
