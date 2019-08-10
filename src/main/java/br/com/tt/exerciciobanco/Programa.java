package br.com.tt.exerciciobanco;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Pedir para o usu�rio digitar:
		// - tipo
		// - valor
		// - descri��o
		// criar um objeto da classe movimento e setar os valores nele
		// imprimir objeto criado
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tipo do movimento (D�bito ou Cr�dito):");
		String tipoLido = scanner.nextLine();
		
		System.out.println("Digite o valor do movimento:");
		Double valorLido = scanner.nextDouble();
		
		System.out.println("Digite a descri��o do movimento:");
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
