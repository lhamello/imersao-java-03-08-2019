package br.com.tt.aula06.colecoes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProgramaIterator {

	public static void main(String[] args) {
		List<String> pessoas = new LinkedList<>();
		pessoas.add("Luiz");
		pessoas.add("Leonardo");
		pessoas.add("Ivan");
		pessoas.add("Simone");
		pessoas.add("Ernani");
		
		System.out.println("--------------");
		for (String pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
		System.out.println("--------------");
		Iterator<String> iterator = pessoas.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
