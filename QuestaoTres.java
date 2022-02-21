package br.com.capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestaoTres {

	public void anagrama(String palavra) {

		List<String> listSubString = new ArrayList<String>();

		for (int i = 0; i <= palavra.length(); i++) {
			for (int y = 0; y <= palavra.length(); y++) {
				if (y > i) {
					char[] subString = palavra.substring(i, y).toCharArray();
					Arrays.sort(subString);
					listSubString.add(Arrays.toString(subString));
				}
			}
		}

		List<String> resultadoList = new ArrayList<String>();
		for (int i = 0; i < listSubString.size(); i++) {
			for (int y = 0; y < listSubString.size(); y++) {
				if (y != i) {
					if (listSubString.get(i).equals(listSubString.get(y))) {
						int finalI = i;
						if (resultadoList.stream().noneMatch(
								subStringEncontrada -> subStringEncontrada.equals(listSubString.get(finalI)))) {
							resultadoList.add(listSubString.get(finalI));
						}
					}
				}
			}
		}

		if (!resultadoList.isEmpty()) {
			System.out.println("A palavra é um Anagrama que contém " + resultadoList.size() + " pares");
		} else {
			System.out.println("A palavra não é um Anagrama");
		}

	}
}
