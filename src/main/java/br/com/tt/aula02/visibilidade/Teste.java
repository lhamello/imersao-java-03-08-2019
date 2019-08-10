package br.com.tt.aula02.visibilidade;

public class Teste {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setCor("Verde");
		System.out.println(carro.getCor());
		
		Carro outroCarro = new Carro();
		outroCarro.setCor("Azul");
		System.out.println(outroCarro.getCor());
	}
}
