package Util;

import java.util.ArrayList;
import java.util.Collections;

public class ManipularVetores {


	/* Metodo para inprimir elementos de um vetor */
	public void printDoVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++)
			System.out.println(vetor[i]);

	}

	public int[] criarVetorvetorInvertido(int tamanhoMaximoDoVetor) {
		int[] vetor = new int[tamanhoMaximoDoVetor];
		int cont = 0;
		for (int i = tamanhoMaximoDoVetor; i > 0; i--) {
			vetor[cont]= i;
			cont++;
		}
		return vetor;
	}

	public int[] criarVetorOrdenado(int tamanhoMaximoDoVetor) {
		int v[] = new int[tamanhoMaximoDoVetor];

		for (int i = 1; i <= v.length; ++i)
			v[i - 1] = i;
		return v;
	}

	public int[] criarVetorAleatorio(int tamanhoMaximoDoVetor) {
		/* Crio um array List */
		ArrayList<Integer> array = new ArrayList<Integer>();
		/* Preenchimento do array do tamanho desejado ordenado */
		for (int i = 0; i < tamanhoMaximoDoVetor; i++)
			array.add(i);
		/* Embaralhando os elementos */
		Collections.shuffle(array);
		int[] vetor = new int[tamanhoMaximoDoVetor];
		/*
		 * Crio um VETOR de inteiros e vou passar os elementos do arrayList Dois
		 * elementos por vez, pra reduzir o tempo e não demorar muito
		 */
		int inicio = 0;
		int fim = tamanhoMaximoDoVetor - 1;
		while (inicio < fim) {
			vetor[inicio] = array.get(inicio);
			vetor[fim] = array.get(fim);
			inicio++;
			fim--;
		}
		return vetor;
	}

	/* Criar um Vetor quase ordenado */
	public int[] criarVetorQuaseOrdenado(int tamanhoMaximoDoVetor) { /* 80% ordenado */
		int[] vetor = new int[tamanhoMaximoDoVetor];
		int doisDec = (2 * tamanhoMaximoDoVetor) / 10;
		int ponto = tamanhoMaximoDoVetor - doisDec;
		int i = 0;
		for (; i < ponto; i++) {
			vetor[i] = i;
		}
		for (int j = tamanhoMaximoDoVetor - 1; j > ponto - 1; j--) {
			vetor[j] = i++;
		}
		return vetor;
	}

	public int[] criarVetorDeAcordoComOTipo(int opcao, int tamanho) {
		if (opcao == 1)
			return this.criarVetorAleatorio(tamanho);
		else if (opcao == 2)
			return this.criarVetorOrdenado(tamanho);
		else if (opcao == 3)
			return this.criarVetorQuaseOrdenado(tamanho);
		else if (opcao == 4)
			return this.criarVetorvetorInvertido(tamanho);
		return null;
	}

}
