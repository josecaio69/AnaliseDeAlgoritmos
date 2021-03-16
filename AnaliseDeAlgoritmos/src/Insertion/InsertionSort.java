package Insertion;

import Util.VariaveisEmComumParaUso;

public class InsertionSort extends VariaveisEmComumParaUso{
	/*
	 * @author José Caio
	 * Algoritmo de ordenação Insertion sorte
	 */

	private void insertion(int[] vetor) {
		for (int i = 1; i < vetor.length; ++i) {
			int key = vetor[i];
			int j = i - 1;
			while (j >= 0 && vetor[j] > key) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = key;
		}
	}
	
	public void usandoInsertionParaExemplos(int tamanhoDoVetorQueSeraManipulado) {
		/* Criando vetor do tamanho desejado */
		super.setVetor(super.getManipulacaoDeVetor().criarEPreencherUmVetor(tamanhoDoVetorQueSeraManipulado));
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
		System.out.println("Tempo Gasto Total Arredondado: " + ((super.getTempoFinal() - super.getTempoInicial()) / 1000) + " Segundos.");

	}

}
