package br.com.tt.aula04.classeabstrata;

public class Programa {

	public static void main(String[] args) {
		Empregado vendedor = new Vendedor("nome", "email", 30, 100.00);
		Empregado instrutor = new Instrutor("nome", "email", 30, 8);
		
		System.out.println("Vendedor: ");
		System.out.println(vendedor.calcularRendimentos());
		vendedor.salvar();
		
		System.out.println("Instrutor: ");
		System.out.println(instrutor.calcularRendimentos());
		instrutor.salvar();
	}
}
