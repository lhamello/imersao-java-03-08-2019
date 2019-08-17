package br.com.tt.exerciciobanco.model;

public class Conta {

	private Integer agencia;
	private Integer numero;
	private Double saldo;
	// array
	private Movimento[] movimentos;
	
	public Conta(Integer agencia, Integer numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0.0;
	}
	
	@Override
	public String toString() {
		return String.format("%s[agencia=%s,numero=%s,saldo=R$ %.2f]", 
				"Conta",
				agencia,
				numero,
				saldo);
	}
}
