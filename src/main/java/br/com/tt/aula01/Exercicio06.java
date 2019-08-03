package br.com.tt.aula01;

// 6) Faça um programa que calcule e o mostre o total do 
// seu salário no referido mês, sabendo-se que 
// são descontados 11% para o Imposto de Renda, 
// 8% para o INSS e 5% para o sindicato. 
// Sendo que o número de horas trabalhadas no mês foram 10 
// e o valor hora é 100 reais. 
// Sendo que o o INSS não é descontado do salário líquido. 
// Informe:
//a) salário bruto
//b) quanto pagou ao INSS
//c) quanto pagou ao sindicato
//d) o salário líquido
//e) total de descontos
public class Exercicio06 {

	public static void main(String[] args) {
		double valorHora = 100.0;
		int horasTrabalhadas = 10;
		
		double salarioBruto = valorHora * horasTrabalhadas;
		double ir = salarioBruto * 0.11;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		
		System.out.println("a) Salário Bruto             = " + salarioBruto);
		System.out.println("b) Quanto pagou ao INSS      = " + inss);
		System.out.println("c) Quanto pagou ao Sindicato = " + sindicato);
		System.out.println("d) Salário líquido           = " + (salarioBruto - ir - sindicato));
		System.out.println("e) Total de descontos        = " + (ir + sindicato));
	}
}
