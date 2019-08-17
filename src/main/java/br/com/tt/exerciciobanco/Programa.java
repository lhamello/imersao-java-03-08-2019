package br.com.tt.exerciciobanco;

import java.util.Scanner;

import br.com.tt.exerciciobanco.infra.DadosSingleton;
import br.com.tt.exerciciobanco.view.TelaCorrentista;

public class Programa {

	public static void main(String[] args) {
		imprimirMenu();
		int opcao = lerOpcao();
		
		while (true) {
			switch (opcao) {
			case 1:
				TelaCorrentista tela = new TelaCorrentista();
				DadosSingleton d = DadosSingleton.getDadosSingleton();
				tela.mostrarTela();
				break;
			case 2:
				// chamar tela movimento
				System.out.println("Tela movimento!");
				break;
			case 0:
				System.out.println("Programa encerrado!");
				System.exit(0);
			default:
				System.out.println("Opção inválida. Selecione outra opção.");
			}
			
			imprimirMenu();
			opcao = lerOpcao();
		}

//		System.out.println("Digite o tipo do movimento (Débito ou Crédito):");
//		String tipoLido = scanner.nextLine();
//		
//		System.out.println("Digite o valor do movimento:");
//		Double valorLido = scanner.nextDouble();
//		
//		System.out.println("Digite a descrição do movimento:");
//		scanner.nextLine();
//		String descricaoLida = scanner.nextLine();
//		
//		scanner.close();
//		
//		Movimento movimento = new Movimento();
//		movimento.setTipo(tipoLido);
//		movimento.setValor(valorLido);
//		movimento.setDescricao(descricaoLida);
//		System.out.println(movimento);
	}
	
	private static int lerOpcao() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	private static void imprimirMenu() {
		System.out.println(" ========= TELA PRINCIPAL =========");
		System.out.println(" Digite: ");
		System.out.println("  [1] para tela correntista");
		System.out.println("  [2] para tela movimento");
		System.out.println("  [0] para sair");
	}
}
