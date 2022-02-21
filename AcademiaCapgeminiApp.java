package br.com.capgemini;

import java.util.Scanner;

public class AcademiaCapgeminiApp {

	public static void main(String[] args) {
		boolean iniciado = true;
		Scanner tecladoMenu = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		QuestaoUm q1 = new QuestaoUm();
		QuestaoDois q2 = new QuestaoDois();
		QuestaoTres q3 = new QuestaoTres();
		while (iniciado) {
			System.out.println("---------------Academia Capgemini----------------");
			System.out.println("Seleciona a questão para realizar o teste!");
			System.out.println("**1** Algoritmo de Escada");
			System.out.println("**2** Algoritmo de Senha");
			System.out.println("**3** Algoritmo do Anagrama");
			System.out.println("**4** Sair");
			String opcao = teclado.nextLine();
			switch (opcao) {
			case "1":
				System.out.println("Informe a quantidade de Degraus");
				int qtdDegraus = tecladoMenu.nextInt();
				q1.escada(qtdDegraus);
				break;
			case "2":
				System.out.println("Informe a senha");
				String senha = teclado.nextLine();
				q2.senha(senha);
				break;
			case "3":
				System.out.println("Informe a palavra");
				String anagramaPalavra = teclado.nextLine();
				q3.anagrama(anagramaPalavra);
				break;
			case "4":
				iniciado = false;
				teclado.close();
				tecladoMenu.close();
				System.out.println("Obrigado por utilizar o nosso sistema, volte sempre!");
				break;
			default:
				System.out.println("Opção incorreta!");
				break;
			}
		}

	}

}
