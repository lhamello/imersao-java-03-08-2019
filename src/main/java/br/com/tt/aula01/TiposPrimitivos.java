package br.com.tt.aula01;

public class TiposPrimitivos {

	public static void main(String[] args) {
		byte idade = 100;
		short numero = 20;
		int dia = 3;
		long numeroMaior = 100;
		float valor = 12.5f;
		double valorMaior = 12.5;
		
		char caracter = 't';
		System.out.println(caracter);
		
		boolean fazSol = true;
		
		int valorA = 10;
		int valorB = 15;
		
		System.out.println("Soma" + " = " + (valorA + valorB));
		System.out.println("Subtração" + " = " + (valorA - valorB));
		System.out.println("Multiplicação" + " = " + (valorA * valorB));
		System.out.println("Divisão" + " = " + (valorA / valorB));
		
		float valorC = 10.0f;
		float valorD = 15.0f;
		System.out.println("Divisão" + " = " + (valorC / valorD));
		System.out.println("Resto" + " = " + (valorC % valorD));
		
		int i = 1;
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
	} 
}
