package br.com.tt.exerciciobanco;

// Singleton é uma classe que terá somente
// uma instância criada dentro do programa
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
