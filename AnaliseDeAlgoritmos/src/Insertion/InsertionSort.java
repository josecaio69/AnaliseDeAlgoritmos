package Insertion;

import Util.VariaveisEmComumParaUso;

public class InsertionSort extends VariaveisEmComumParaUso {
	/*
	 * @author José Caio Algoritmo de ordenação Insertion sort
	 */

	public void insertion(int[] vetor) {
		super.setTempoInicial(System.currentTimeMillis());
		int n = vetor.length;
		for (int i = 1; i < n; ++i) {
			int chave = vetor[i];
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && vetor[j] > chave) {
				super.setQuantidadeDeComparacoes(super.getQuantidadeDeComparacoes() + 1);
				vetor[j + 1] = vetor[j];
				j = j - 1;
				super.setQuantidadeDeTrocas(super.getQuantidadeDeTrocas() + 1);
			}
			super.setQuantidadeDeComparacoes(super.getQuantidadeDeComparacoes() + 1);
			if (vetor[j + 1] != chave)
				vetor[j + 1] = chave;
		}
		super.setTempoFinal(System.currentTimeMillis());
	}

	public void usandoInsertionParaExemplos(int tamanhoDoVetorQueSeraManipulado) {
		/* Criando vetor do tamanho desejado */
		super.setVetor(super.getManipulacaoDeVetor().criarVetorAleatorio(tamanhoDoVetorQueSeraManipulado));
		System.out.println("Insertion sort com vetor tamanho " + tamanhoDoVetorQueSeraManipulado);
		/* Cauculando tempo de inicio */
		super.setTempoInicial(System.currentTimeMillis());
		System.out.println("Tempo Inicial: " + super.getTempoInicial() + " Milissegundos.");
		this.insertion(super.getVetor());
		/* Calculando tempo final */
		super.setTempoFinal(System.currentTimeMillis());
		System.out.println("Tempo Final:   " + super.getTempoFinal() + " Milissegundos.");
		/*
		 * Tempo total gasto end-start/1000 para converter de milissegundos para
		 * segundos
		 */
		System.out.println("Tempo Gasto Total Arredondado: "
				+ ((super.getTempoFinal() - super.getTempoInicial()) / 1000d) + " Segundos.");

	}

}
