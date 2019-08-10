package br.com.tt.exerciciobanco;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Pedir para o usuário digitar:
		// - tipo
		// - valor
		// - descrição
		// criar um objeto da classe movimento e setar os valores nele
		// imprimir objeto criado
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tipo do movimento (Débito ou Crédito):");
		String tipoLido = scanner.nextLine();
		
		System.out.println("Digite o valor do movimento:");
		Double valorLido = scanner.nextDouble();
		
		System.out.println("Digite a descrição do movimento:");
		scanner.nextLine();
		String descricaoLida = scanner.nextLine();
		
		scanner.close();
		
		Movimento movimento = new Movimento();
		movimento.setTipo(tipoLido);
		movimento.setValor(valorLido);
		movimento.setDescricao(descricaoLida);
		System.out.println(movimento);
	}
}
