package br.com.tt.exerciciobanco.infra;

import br.com.tt.exerciciobanco.model.Correntista;

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
	
	public void adicionarCorrentista(Correntista correntista) {
		if (correntistas == null) {
			correntistas = new Correntista[100];
		}
		
		for (int indice = 0; indice < correntistas.length; indice++) {
			
			if (correntistas[indice] == null) {
				correntistas[indice] = correntista;
				break;
			}
		}
	}

	public Correntista[] listarCorrentistas() {
		return correntistas;
	}
}
