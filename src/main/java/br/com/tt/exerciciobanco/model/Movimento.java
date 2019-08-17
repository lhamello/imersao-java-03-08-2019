package br.com.tt.exerciciobanco.model;

public class Movimento {

	// atributos
	private String tipo;
	private Double valor;
	private String descricao;
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// %s - para imprimir string
	// %d - para imprimir números inteiros
	// %f - para imprimir números com ponto flutuante
	@Override
	public String toString() {
		return String.format("Movimento[tipo=%s,valor=R$ %.2f,descricao=%s]", 
				tipo, valor, descricao);
	}
}
