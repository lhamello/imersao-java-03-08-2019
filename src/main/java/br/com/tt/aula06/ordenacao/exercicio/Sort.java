package br.com.tt.aula06.ordenacao.exercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sort {

    /**
     * Exercício: use a classe a seguir para fazer a leitura do arquivo.
     * 1 - Crie um HashSet com o nome e ordene.
     * 2 - Crie uma classe Pessoa com os campos id e nome. Crie uma pessoa para cada linha do arquivo.
     *     Ordene as pessoas pelo nome.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(getInputFile());
        Set<String> nomes = new HashSet<>();
        List<Pessoa> pessoas = new LinkedList<>();
        
        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] partes = linha.split(";");

            String id = partes[0];
            String nome = partes[1];
            
            nomes.add(nome);
            pessoas.add(new Pessoa(id, nome));

//            System.out.println(id);
//            System.out.println(nome);
        }
        
        System.out.println("----- HashSet<String>");
        
        List<String> listaDeNomes = new LinkedList<>(nomes);
        Collections.sort(listaDeNomes);
        
        for (String nome : listaDeNomes) {
			System.out.println(nome);
		}
        
        System.out.println("----- LinkedList<Pessoa>");
        Collections.sort(pessoas);
        
        for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
        
        sc.close();
    }

    //Conteúdo de https://paste.ee/p/nSLSB
    // Coloque na pasta /resources/
    private static File getInputFile() {
        // Ou return new File(SuaClasse.class.getClassLoader().getResource("input_1.csv").toURI());
        return new File("src/main/resources/input_1.csv");
    }
}