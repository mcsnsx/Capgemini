package DesafioTres;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DesafioTres {

	public static void main(String[] args) {
		String palavra;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com texto: ");
		palavra = leia.nextLine();

		anagrama(palavra);
	}

	static void anagrama(String palavra) {

		HashMap<String, Integer> mapa = new HashMap<>();

		for (int x = 0; x <= palavra.length(); x++) {

			for (int n = x; n < palavra.length(); n++) {

				char[] letra = palavra.substring(x, n + 1).toCharArray();
				Arrays.sort(letra);
				String subLetra = new String(letra);

				if (mapa.containsKey(subLetra)) {
					mapa.put(subLetra, mapa.get(subLetra) + 1);
				} else {
					mapa.put(subLetra, 1);
				}
			}
		}

		int par = 0;

		for (String cont : mapa.keySet()) {

			int i = mapa.get(cont);
			par += (i * (i - 1)) / 2;
		}
		System.out.print("O número de pares que são anagramas é " + par);
	}

}
