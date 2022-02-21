package br.com.capgemini;

public class QuestaoUm {
	public void escada(int qntDesgraus) {
		int baseEscada = qntDesgraus, quantidadeAsterisco = 1;
		for (int i = 1; i <= qntDesgraus; i++) {
			for (int j = 0; j <= qntDesgraus; j++)
				if (j == baseEscada) {
					for (int i2 = 1; i2 <= quantidadeAsterisco; i2++) {
						System.out.print("*");
					}
					quantidadeAsterisco++;
					baseEscada--;
				} else {
					System.out.print(" ");
				}
			System.out.println();
		}
	}
}
