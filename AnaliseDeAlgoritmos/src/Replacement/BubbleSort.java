package Replacement;

import Util.VariaveisEmComumParaUso;

public class BubbleSort extends VariaveisEmComumParaUso{


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
				}
			}
		}
	}

	/*
	 * Usando o bolha atendendo o que foi pedido na atividade de analise de
	 * algoritmos
	 */

	public void usandoBolhaParaExemplos(int tamanhoDoVetorQueSeraManipulado) {
		/* Criando vetor do tamanho desejado */
		super.setVetor(super.getManipulacaoDeVetor().criarEPreencherUmVetor(tamanhoDoVetorQueSeraManipulado));
		System.out.println("Buble sort com vetor tamanho " + tamanhoDoVetorQueSeraManipulado);
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
		System.out.println("Tempo Gasto Total: " + ((super.getTempoFinal() - super.getTempoInicial()) / 1000) + " Segundos.");

	}

}
