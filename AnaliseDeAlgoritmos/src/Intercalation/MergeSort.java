package Intercalation;

import Util.VariaveisEmComumParaUso;

public class MergeSort extends VariaveisEmComumParaUso {

	private void intercalar(int[] vetor, int inicio, int meio, int fim) {
		/* Vetor utilizado para guardar os valors ordenados. */
		int novoVetor[] = new int[fim - inicio];
		/* Variavel utilizada para guardar a posicao do inicio do vetor. */
		int i = inicio;
		/* Variavel utilizada para guardar a posição do meio do vetor. */
		int m = meio;
		/*
		 * Variavel utilizada para guarda a posição onde os valores serão inseridos no
		 * novo vetor.
		 */
		int pos = 0;

		/*
		 * Enquanto o inicio não chegar até o meio do vetor, ou o meio do vetor não
		 * chegar até seu fim, compara os valores entre o inicio e o meio, verificando
		 * em qual ordem vai guarda-los ordenado.
		 */
		while (i < meio && m < fim) {
			/*
			 * Se o vetor[i] for menor que o vetor[m], então guarda o valor do vetor[i] pois
			 * este é menor.
			 */
			if (vetor[i] <= vetor[m]) {
				novoVetor[pos] = vetor[i];
				pos = pos + 1;
				i = i + 1;
				// Senão guarda o valor do vetor[m] pois este é o menor.
			} else {
				novoVetor[pos] = vetor[m];
				pos = pos + 1;
				m = m + 1;
			}
		}

		// Adicionar no vetor os elementos que estão entre o inicio e meio,
		// que ainda não foram adicionados no vetor.
		while (i < meio) {
			novoVetor[pos] = vetor[i];
			pos = pos + 1;
			i = i + 1;
		}

		// Adicionar no vetor os elementos que estão entre o meio e o fim,
		// que ainda não foram adicionados no vetor.
		while (m < fim) {
			novoVetor[pos] = vetor[m];
			pos = pos + 1;
			m = m + 1;
		}

		// Coloca no vetor os valores já ordenados.
		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			vetor[i] = novoVetor[pos];
		}
	}

	public void mergeSortUsandoRecursividade(int inicio, int fim, int[] vetor) {
		/*
		 * Se o inicio for menor que o fim menos 1, significa que tem elementos dentro
		 * do vetor.
		 */
		if (inicio < fim - 1) {
			// Guarda a posição do meio do vetor.
			int meio = (inicio + fim) / 2;

			/*
			 * Chama este método recursivamente, indicando novas posições do inicio e fim do
			 * vetor.
			 */
			mergeSortUsandoRecursividade(inicio, meio, vetor);

			/*
			 * Chama este método recursivamente, indicando novas posições do inicio e fim do
			 * vetor.
			 */
			mergeSortUsandoRecursividade(meio, fim, vetor);

			// Chama o método que intercala os elementos do vetor.
			intercalar(vetor, inicio, meio, fim);
		}
	}
	public void usandoMergeParaExemplos(int tamanhoDoVetorQueSeraManipulado) {
		/* Criando vetor do tamanho desejado */
		super.setVetor(getManipulacaoDeVetor().criarEPreencherUmVetor(tamanhoDoVetorQueSeraManipulado));
		System.out.println("Merge sort com vetor tamanho " + tamanhoDoVetorQueSeraManipulado);
		/* Cauculando tempo de inicio */
		super.setTempoInicial(System.currentTimeMillis());
		System.out.println("Tempo Inicial: " + super.getTempoInicial() + " Milissegundos.");
		this.mergeSortUsandoRecursividade(0, super.getVetor().length, super.getVetor());
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
