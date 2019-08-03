package br.com.tt.aula01;

public class ComandosCondicionaisERepeticao {

	public static void main(String[] args) {
		boolean ehSabado = false;

		if (ehSabado) {
			System.out.println("Aula Iniciada");
			System.out.println("Bom dia alunos!");
		}
		// -------------------------------------------
		float valorCompra = 100.00f;

		if (valorCompra >= 100.f) {
			System.out.println("Parcelo em 10x");
		} else {
			System.out.println("Somente à vista");
		}
		// -------------------------------------------
		valorCompra = 50.00f;

		if (valorCompra >= 100.f) {
			System.out.println("Parcelo em 10x");
		} else if (valorCompra >= 50.0f) {
			System.out.println("Parcelo em 5x");
		} else {
			System.out.println("Somente à vista");
		}

		System.out.println("Programa finalizado.");
		// -------------------------------------------
		for (int i = 0; i < 1; i++) {
			System.out.println("for = " + i);
		}
		// -------------------------------------------
		int i = 0;
		while (i < 1) {
			System.out.println("while = " + i);
			i++;
		}
		// -------------------------------------------
		i = 0;

		do {
			System.out.println("do while = " + i);
			i++;
		} while (i < 1);
		// -------------------------------------------
		for (i = 1; i < 1; i++) {
			System.out.println("for = " + i);
		}
		// -------------------------------------------
		i = 1;
		while (i < 1) {
			System.out.println("while = " + i);
			i++;
		}
		// -------------------------------------------
		i = 1;

		do {
			System.out.println("do while = " + i);
			i++;
		} while (i < 1);
		
		mostrarComandoSwitch(2);
		mostrarComandoSwitch(2);
		mostrarComandoSwitch(3);
		mostrarComandoSwitch(4);
		mostrarComandoSwitch(5);
		mostrarComandoSwitch(6);
		mostrarComandoSwitch(7);
		mostrarComandoSwitch(0);
	}
	
	private static void mostrarComandoSwitch(int diaSemana) {
		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Dia inválido");
			break;
		}
	}
}
