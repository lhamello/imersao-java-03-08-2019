package br.com.tt.aula06.ordenacao;

public class Carro implements Comparable<Carro> {

	private String modelo;
	private Float kmPorLitro;
	
	public Carro(String modelo, Float kmPorLitro) {
		this.modelo = modelo;
		this.kmPorLitro = kmPorLitro;
	}
	
	public Float getKmPorLitro() {
		return kmPorLitro;
	}
	
	@Override
	public String toString() {
		return String.format("Carro[modelo=%s,kmPorLitro=%.2f]",
				modelo,
				kmPorLitro);
	}

	@Override
	public int compareTo(Carro outroCarro) {
		return this.modelo.compareTo(outroCarro.modelo);
	}
}
