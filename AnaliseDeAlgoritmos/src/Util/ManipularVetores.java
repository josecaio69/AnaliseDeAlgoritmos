package Util;

import java.util.Random;

public class ManipularVetores {
	public void printDoVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++)
			System.out.print(vetor[i] + " - ");
		System.out.println("\n");
	}

	public void embaralharVetor(int[] vetor) {

		Random random = new Random();

		for (int i = 0; i < (vetor.length - 1); i++) {

			// sorteia um índice
			int j = random.nextInt(vetor.length);

			// troca o conteúdo dos índices i e j do vetor
			int troca = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = troca;
		}

	}

	public void inverterVetor(int[] vetor) {
		int tamanho = vetor.length - 1;
		int cont = 0;
		while (tamanho > cont) {
			int troca = vetor[cont];
			vetor[cont] = vetor[tamanho];
			vetor[tamanho] = troca;
			tamanho--;
			cont++;
		}
	}

	public int[] criarEPreencherUmVetor(int tamanhoMaximoDoVetor) {
		Random random = new Random();
		int vetor[] = new int[tamanhoMaximoDoVetor];
		for (int i = 0; i < vetor.length; i++)
			vetor[i] = random.nextInt(tamanhoMaximoDoVetor*2);

		return vetor;
	}

}
