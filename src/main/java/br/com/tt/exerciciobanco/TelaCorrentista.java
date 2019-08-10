package br.com.tt.exerciciobanco;

import java.util.Scanner;

public class TelaCorrentista {
	
	private Scanner scanner = new Scanner(System.in);
	
	private void imprimirMenu() {
		System.out.println(" ========= TELA CORRENTISTA =========");
		System.out.println(" Digite: ");
		System.out.println("  [1] para cadastrar novo correntista");
		System.out.println("  [2] para listar correntistas");
		System.out.println("  [0] para voltar");
	}

	private int lerOpcao() {
		return scanner.nextInt();
	}

	public void mostrarTela() {
		int opcao;

		do {
			imprimirMenu();
			opcao = lerOpcao();
			DadosSingleton d = DadosSingleton.getDadosSingleton();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do correntista:");
				scanner.nextLine();
				String nomeCorrentista = scanner.nextLine();
				
				System.out.println("Digite a agência da conta:");
				Integer agenciaConta = scanner.nextInt();
				
				System.out.println("Digite o número da conta:");
				Integer numeroConta = scanner.nextInt();
				
				Conta contaCorrentista = new Conta(agenciaConta, numeroConta);
				Correntista correntista = new Correntista(nomeCorrentista, 
						contaCorrentista);
				System.out.println("Correntista criado");
				break;
			case 2:
				// chamar tela movimento
				System.out.println("Listar correntista");
				break;
			case 0:
				System.out.println("Voltar");
				return;
			default:
				System.out.println("Opção inválida. Selecione outra opção.");
			}
		} while (opcao != 0);
	}
}
