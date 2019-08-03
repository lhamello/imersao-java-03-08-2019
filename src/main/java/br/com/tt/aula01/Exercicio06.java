package br.com.tt.aula01;

// 6) Fa�a um programa que calcule e o mostre o total do 
// seu sal�rio no referido m�s, sabendo-se que 
// s�o descontados 11% para o Imposto de Renda, 
// 8% para o INSS e 5% para o sindicato. 
// Sendo que o n�mero de horas trabalhadas no m�s foram 10 
// e o valor hora � 100 reais. 
// Sendo que o o INSS n�o � descontado do sal�rio l�quido. 
// Informe:
//a) sal�rio bruto
//b) quanto pagou ao INSS
//c) quanto pagou ao sindicato
//d) o sal�rio l�quido
//e) total de descontos
public class Exercicio06 {

	public static void main(String[] args) {
		double valorHora = 100.0;
		int horasTrabalhadas = 10;
		
		double salarioBruto = valorHora * horasTrabalhadas;
		double ir = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		
		System.out.println("a) Sal�rio Bruto             = " + salarioBruto);
		System.out.println("b) Quanto pagou ao INSS      = " + inss);
		System.out.println("c) Quanto pagou ao Sindicato = " + sindicato);
		System.out.println("d) Sal�rio l�quido           = " + (salarioBruto - ir - sindicato));
		System.out.println("e) Total de descontos        = " + (ir + sindicato));
	}
}
