package br.com.tt.aula01;

public class ComandosCondicionais2 {

	public static void main(String[] args) {
		mostrarBreak();
		mostrarContinue();
		mostrarReturn();
	}
	
	private static void mostrarBreak() {
		int linhas = 0;
		
		for (int i = 0; i < 100; i++) {
			
			for (int j = 0; j < 100; j++) {
				System.out.println("i = " + i + " j = " + j);
				linhas++;
				if (i == j) {
					break;
				}
			}
		}
		
		System.out.println("-------> linhas break = " + linhas);
	}
	
	private static void mostrarContinue() {
		int linhas = 0;
		
		for (int i = 0; i < 100; i++) {
			
			for (int j = 0; j < 100; j++) {
				System.out.println("i = " + i + " j = " + j);
				linhas++;
				
				if (i == j) {
					continue;
				}
			}
		}
		
		System.out.println("-------> linhas continue = " + linhas);
	}
	
	private static void mostrarReturn() {
		int linhas = 0;
		
		for (int i = 0; i < 100; i++) {
			
			for (int j = 0; j < 100; j++) {
				System.out.println("i = " + i + " j = " + j);
				linhas++;
				
				if (i == j) {
					System.out.println("-------> linhas return = " + linhas);
					return;
				}
			}
		}
	}
}
