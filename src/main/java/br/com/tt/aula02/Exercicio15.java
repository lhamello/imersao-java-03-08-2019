package br.com.tt.aula02;

//15) Fa�a um la�o que calcule a soma das potencias de um n�mero x.
//Exemplo: x^1 + x^2 ... x^10  
public class Exercicio15 {

	public static void main(String[] args) {
		int x = 2;
		double soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			soma = soma + Math.pow(x, i);
		}
		
		System.out.println("SOMA = " + soma);
	}
}
