package Intercalation;

import Util.VariaveisEmComumParaUso;

public class MergeSort extends VariaveisEmComumParaUso {
	
	public void mergeSort(int[] vetor) {
		super.setTempoInicial(System.currentTimeMillis()); // registra o tempo inicial metodo
		int[] w = new int[vetor.length]; // vetor auxiliar
		sort(vetor, w, 0, vetor.length - 1); // chama metodo sort passando o vetor, um vetor auxiliar, posição inicial
		// do vetor e final do vetor
		super.setTempoFinal(System.currentTimeMillis()); // registra o tempo final do metodo
		// calcula tempo total do metodo
		// seta os resultados dentro do vetor resul e retorna

	}

	public void sort(int[] vetor, int[] aux, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			sort(vetor, aux, inicio, meio);
			sort(vetor, aux, meio + 1, fim);
			merge(vetor, aux, inicio, meio, fim);
		}
	}

	private void merge(int[] vetor, int[] aux, int inicio, int meio, int fim) {
		for (int k = inicio; k <= fim; k++) {
			aux[k] = vetor[k];
		}
		int i = inicio;
		int j = meio + 1;

		for (int x = inicio; x <= fim; x++) {
			if (i > meio) {
				vetor[x] = aux[j++];
			} else if (j > fim) {
				vetor[x] = aux[i++];
			} else if (aux[i] < aux[j]) {
				vetor[x] = aux[i++];
				super.setQuantidadeDeComparacoes(super.getQuantidadeDeComparacoes()+1);
			} else {
				vetor[x] = aux[j++];
				super.setQuantidadeDeComparacoes(super.getQuantidadeDeComparacoes()+1);
				super.setQuantidadeDeTrocas(super.getQuantidadeDeTrocas()+1);
			}
		}
	}

	public void usandoMergeParaExemplos(int tamanhoDoVetorQueSeraManipulado) {
		/* Criando vetor do tamanho desejado */
		super.setVetor(getManipulacaoDeVetor().criarVetorAleatorio(tamanhoDoVetorQueSeraManipulado));
		System.out.println("Merge sort com vetor tamanho " + tamanhoDoVetorQueSeraManipulado);
		/* Cauculando tempo de inicio */
		super.setTempoInicial(System.currentTimeMillis());
		System.out.println("Tempo Inicial: " + super.getTempoInicial() + " Milissegundos.");
		// this.mergeSortUsandoRecursividade(0, super.getVetor().length,
		// super.getVetor());
		/* Calculando tempo final */
		super.setTempoFinal(System.currentTimeMillis());
		System.out.println("Tempo Final:   " + super.getTempoFinal() + " Milissegundos.");
		/*
		 * Tempo total gasto end-start/1000 para converter de milissegundos para
		 * segundos
		 */
		System.out.println(
				"Tempo Gasto Total: " + ((super.getTempoFinal() - super.getTempoInicial()) / 1000d) + " Segundos.");
	}
}
