package br.com.tt.exerciciobanco;

// Singleton � uma classe que ter� somente
// uma inst�ncia criada dentro do programa
public class DadosSingleton {

	private static DadosSingleton instancia;
	private Correntista[] correntistas;
	
	private DadosSingleton() {
	}
	
	public static DadosSingleton getDadosSingleton() {
		if (instancia == null) {
			instancia = new DadosSingleton();
		} 
		
		return instancia;
	}
}
