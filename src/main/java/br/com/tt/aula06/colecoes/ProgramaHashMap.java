package br.com.tt.aula06.colecoes;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ProgramaHashMap {

	public static void main(String[] args) {
		Map<String, String> estados = new HashMap<>();
		estados.put("RS", "Rio Grande do Sul");
		estados.put("SC", "Santa Catarina");
		
		String valor = estados.get("RS");
		System.out.println(valor);
		
		System.out.println("-----------");
		for (String chave : estados.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("-----------");
		for (String value : estados.values()) {
			System.out.println(value);
		}
		
		System.out.println("-----------");
		Map<LocalDate, List<Integer>> sorteios = new HashMap<>();

		Random random = new Random();
		
		List<Integer> numeros = new LinkedList<>();
		numeros.add(random.nextInt(61));
		numeros.add(random.nextInt(61));
		numeros.add(random.nextInt(61));
		numeros.add(random.nextInt(61));
		numeros.add(random.nextInt(61));
		numeros.add(random.nextInt(61));
		
		LocalDate data = LocalDate.of(2018, Month.JULY, 1);
		
		sorteios.put(data, numeros);
		
		System.out.println(sorteios);
	}
}
