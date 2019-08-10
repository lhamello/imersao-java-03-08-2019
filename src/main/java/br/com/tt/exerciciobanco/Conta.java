package br.com.tt.exerciciobanco;

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
}
