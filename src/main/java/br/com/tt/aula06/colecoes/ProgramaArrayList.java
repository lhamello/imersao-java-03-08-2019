package br.com.tt.aula06.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaArrayList {

	public static void main(String[] args) {
		List<String> carros = new ArrayList<>();
		carros.add("Volvo");
		carros.add("Ford");
		System.out.println(carros);
		
		// obter um dos itens pelo índice
		System.out.println("------------");
		String item = carros.get(0);
		System.out.println(item);
		
		// alterando um dos itens
		System.out.println("------------");
		carros.set(0, "BMW");
		item = carros.get(0);
		System.out.println(item);
		System.out.println(carros);
		
		// removendo um item
		System.out.println("------------");
		carros.remove(0);
		System.out.println(carros);
		
		// verificar se lista contém item
		System.out.println("------------");
		boolean contemItem = carros.contains("BMW");
		System.out.println(contemItem);
		
		// adicionar outros valores
		carros.add("Chevrolet");
		carros.add("Peugeot");
		
		// percorrer lista
		System.out.println("------------");
		for (String carro : carros) {
			System.out.println(carro);
		}
		
		// ordenar a lista
		System.out.println("------------");
		Collections.sort(carros);
		System.out.println(carros);
		
		// ordem reversa
		System.out.println("------------");
		Collections.reverse(carros);
		System.out.println(carros);
		
		// limpar a lista
		System.out.println("------------");
		carros.clear();
		System.out.println(carros);
	}
}
