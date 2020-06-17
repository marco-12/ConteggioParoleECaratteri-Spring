package it.dstech.model;

import java.util.Arrays;
import java.util.List;

public class Conteggio {

	private String frase;

	public Conteggio(String frase) {
		super();
		this.frase = frase;
	}

	public int contaParole(String frase) {
		String[] parole = frase.split(" ");
		return parole.length;

	}

	public int contaVocali(String frase) {

		int numeroVocali = 0;

		List<Character> vocali = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		for (int i = 0; i < frase.length(); i++) {
			char lettera = frase.charAt(i);
			if (lettera == ' ') {
				continue;
			}

			Boolean consonante = !vocali.contains(Character.toLowerCase(lettera));

			if (!consonante) {
				numeroVocali++;
			}
		}
		return numeroVocali;
	}

	public int contaConsonanti(String frase) {

		int numeroConsonanti = 0;

		List<Character> vocali = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		for (int i = 0; i < frase.length(); i++) {
			char lettera = frase.charAt(i);
			if (lettera == ' ') {
				continue;
			}

			Boolean consonante = !vocali.contains(Character.toLowerCase(lettera));

			if (consonante) {
				numeroConsonanti++;
			}
		}
		return numeroConsonanti;
	}

}
