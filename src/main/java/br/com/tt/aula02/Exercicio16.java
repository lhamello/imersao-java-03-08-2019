package br.com.tt.aula02;

import java.util.Scanner;

public class Exercicio16 {
	
	private static int contarNumeroCaracteresString(String texto) {
		return texto.length();
	}
	
	private static String colocarStringEmMaiusculo(String texto) {
		return texto.toUpperCase();
	}
	
	private static int contarVogaisDaString(String texto) {
		int contadorVogais = 0;
		
		for (int indice = 0; indice < texto.length(); indice++) {
			char caracter = texto.charAt(indice);
			
			if (caracter == 'a' || caracter == 'e' || caracter == 'i'
					|| caracter == 'o' || caracter == 'u'
					|| caracter == 'A' || caracter == 'E' || caracter == 'I'
					|| caracter == 'O' || caracter == 'U') {
				contadorVogais++;
			}
		}
		
		return contadorVogais;
	}
	
	private static int contarVogaisDaStringComExpressaoRegular(String texto) {
		return texto.replaceAll("[^aeiouAEIOU]", "").length();
	}
	
//	private static boolean verificarStringIniciaComUni(String texto) {
//		return texto.startsWith("UNI") || texto.startsWith("uni") || texto.startsWith("Uni");
//	}
	
	private static boolean verificarStringIniciaComUni2(String texto) {
		String parteString = texto.substring(0, 3);
		return parteString.equalsIgnoreCase("uni");
	}
	
	private static boolean verificarStringIniciaComUni3(String texto) {
		String textoInformado = texto.toLowerCase();
		String comparacao = "uni";
		return textoInformado.startsWith(comparacao);
	}
	
	private static boolean verificarStringFinalComRio(String texto) {
		String parteString = texto.substring(texto.length() - 3, texto.length());
		return parteString.equalsIgnoreCase("rio");
	}
	
	private static boolean verificarStringFinalComRio2(String texto) {
		String textoInformado = texto.toLowerCase();
		String comparacao = "rio";
		return textoInformado.endsWith(comparacao);
	}
	
	private static int contarDigitosDaString(String texto) {
		int contadorDigitos = 0;
		
		for (int indice = 0; indice < texto.length(); indice++) {
			char caracter = texto.charAt(indice);
			
			if (caracter == '0' || caracter == '1' || caracter == '2'
					|| caracter == '3' || caracter == '4'
					|| caracter == '5' || caracter == '6' || caracter == '7'
					|| caracter == '8' || caracter == '9') {
				contadorDigitos++;
			}
		}
		
		return contadorDigitos;
	}
	
	private static int contarDigitosDaString2(String texto) {
		return texto.replaceAll("\\D", "").length();
	}
	
	private static boolean verificarSeTextoEhPalindromo(String texto) {
		int indiceEsquerda = 0;
		int indiceDireita = texto.length() - 1;
		
		while (indiceDireita > indiceEsquerda) {
			char caracterEsq = texto.charAt(indiceEsquerda);
			char caracterDir = texto.charAt(indiceDireita);
			
			if (caracterEsq != caracterDir) {
				return false;
			}
			
			indiceDireita--;
			indiceEsquerda++;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Digite um texto: ");
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();
		scanner.close();
		System.out.println("O texto digitado foi: " + texto);
		
		System.out.println("a) número de caracteres   = " + contarNumeroCaracteresString(texto));
		System.out.println("b) string em maiúsculo    = " + colocarStringEmMaiusculo(texto));
		System.out.println("c) número de vogais       = " + contarVogaisDaString(texto));
		System.out.println("c) número de vogais [er]  = " + contarVogaisDaStringComExpressaoRegular(texto));
//		System.out.println("d) string começa com UNI  = " + verificarStringIniciaComUni(texto));
		System.out.println("d) string começa com UNI  = " + verificarStringIniciaComUni2(texto));
		System.out.println("d) string começa com UNI  = " + verificarStringIniciaComUni3(texto));
		System.out.println("e) string termina com RIO = " + verificarStringFinalComRio(texto));
		System.out.println("e) string termina com RIO = " + verificarStringFinalComRio2(texto));
		System.out.println("f) número de dígitos      = " + contarDigitosDaString(texto));
		System.out.println("f) número de dígitos      = " + contarDigitosDaString2(texto));
		System.out.println("g) é palíndromo           = " + verificarSeTextoEhPalindromo(texto));
//		Socorram-me, subi no ônibus em Marrocos
	}
}
