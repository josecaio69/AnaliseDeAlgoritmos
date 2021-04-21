package Replacement;

import Util.VariaveisEmComumParaUso;

public class BubbleSort extends VariaveisEmComumParaUso {

	/*
	 * O metodo Bubble é o mais simples e o menos eficiente onde ele verifica todo
	 * elemento par a par e faz trocas quandoo for necessario até percorrer todo o
	 * vetor N vezes N
	 */

	public void bolha(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int troca = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = troca;
					/*
					 * Toda vez que acontecer uma troca de um elemento com outro, atualizamos o
					 * indice de troca na classe pai
					 */
					super.setQuantidadeDeTrocas(super.getQuantidadeDeTrocas() + 1);
				}
				/*
				 * Toda vez que se compara um elemento com outro, atualizamos o indice de
				 * comparação na classe pai
				 */
				super.setQuantidadeDeComparacoes(super.getQuantidadeDeComparacoes() + 1);
			}
		}
	}

	/*
	 * Usando o bolha atendendo o que foi pedido na atividade de analise de
	 * algoritmos via console (caso o professor deseje
	 */

	public void ordenarComBubbleSort(int[] vetorParaSerOrdenado) {
		super.setQuantidadeDeTrocas(0);
		super.setQuantidadeDeComparacoes(0);
		/* Criando vetor do tamanho desejado */
		super.setVetor(vetorParaSerOrdenado);
		System.out.println("Buble sort com vetor tamanho " + vetorParaSerOrdenado.length);
		/* Cauculando tempo de inicio */
		super.setTempoInicial(System.currentTimeMillis());
		System.out.println("Tempo Inicial: " + super.getTempoInicial() + " Milissegundos.");
		this.bolha(super.getVetor());
		/* Calculando tempo final */
		super.setTempoFinal(System.currentTimeMillis());
		System.out.println("Tempo Final:   " + super.getTempoFinal() + " Milissegundos.");
		/*
		 * Tempo total gasto end-start/1000 para converter de milissegundos para
		 * segundos
		 */
		System.out.println(
				"Tempo Gasto Total: " + ((super.getTempoFinal() - super.getTempoInicial()) / 1000d) + " Segundos.");
		System.out.println("Quantidade total de comparações : " + super.getQuantidadeDeComparacoes());
		System.out.println("Quantidade total de trocas: " + super.getQuantidadeDeTrocas());

	}

//	public void bolhaVetorAleatorio(int tamanhoDoVetor) {
//		int vetor[] = super.getManipulacaoDeVetor().criarVetorAleatorio(tamanhoDoVetor);
//		this.ordenarComBubbleSort(vetor);
//	}
//
//	public void bolhaVetorJaOrdenado(int tamanhoDoVetor) {
//		int vetor[] = super.getManipulacaoDeVetor().criarVetorAleatorio(tamanhoDoVetor);
//		super.getQuicksort().quickSort(vetor, 0, vetor.length - 1);
//		this.ordenarComBubbleSort(vetor);
//	}
//
//	public void bolhaVetorInverso(int tamanhoDoVetor) {
//		int vetor[] = super.getManipulacaoDeVetor().criarVetorAleatorio(tamanhoDoVetor);
//		super.getQuicksort().quickSort(vetor, 0, vetor.length - 1);
//		super.getManipulacaoDeVetor().inverterVetor(vetor);
//		this.ordenarComBubbleSort(vetor);
//	}

}
