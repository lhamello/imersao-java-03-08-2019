package br.com.tt.aula06.ordenacao;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProgramaOrdenacao {

	public static void main(String[] args) {
		List<Carro> carros = new LinkedList<>();
		carros.add(new Carro("Honda", 10.0f));
		carros.add(new Carro("Peugeot", 9.0f));
		carros.add(new Carro("Volkswagen", 13.0f));
		carros.add(new Carro("Ford", 11.0f));
		carros.add(new Carro("Chevrolet", 11.0f));
		carros.add(new Carro("Hyundai", 9.0f));
		
		System.out.println("---------- ordem de inserção");
		for (Carro carro : carros) {
			System.out.println(carro);
		}
		
		System.out.println("---------- ordenado por modelo");
		Collections.sort(carros);
		for (Carro carro : carros) {
			System.out.println(carro);
		}
		
		System.out.println("---------- ordenado por km por litro");
		OrdenacaoCarroKmPorLitroDesc comparator = new OrdenacaoCarroKmPorLitroDesc();
		Collections.sort(carros, comparator);
		for (Carro carro : carros) {
			System.out.println(carro);
		}
	}
}
