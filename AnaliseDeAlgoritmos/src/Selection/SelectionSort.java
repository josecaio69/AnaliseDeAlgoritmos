package Selection;

import Util.VariaveisEmComumParaUso;

public class SelectionSort extends VariaveisEmComumParaUso{

	public void selection(int[] vetor) {

		for (int i = 0; i < vetor.length - 1; i++) {
			int indiceDoMenor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				super.setQuantidadeDeComparacoes(super.getQuantidadeDeComparacoes()+1);
				if (vetor[j] < vetor[indiceDoMenor]) {
					indiceDoMenor = j;
				}
			}
			int troca = vetor[indiceDoMenor];
			vetor[indiceDoMenor] = vetor[i];
			vetor[i] = troca;
			super.setQuantidadeDeTrocas(super.getQuantidadeDeTrocas()+1);
		}

	}
	
	public void usandoSelectionParaExemplos(int tamanhoDoVetorQueSeraManipulado) {
		/* Criando vetor do tamanho desejado */
		super.setVetor((getManipulacaoDeVetor().criarVetorAleatorio(tamanhoDoVetorQueSeraManipulado)));
		System.out.println("Selection sort com vetor tamanho " + tamanhoDoVetorQueSeraManipulado);
		/* Cauculando tempo de inicio */
		super.setTempoInicial(System.currentTimeMillis());
		System.out.println("Tempo Inicial: " + super.getTempoInicial() + " Milissegundos.");
		this.selection(super.getVetor());
		/* Calculando tempo final */
		super.setTempoFinal(System.currentTimeMillis());
		System.out.println("Tempo Final:   " + super.getTempoFinal() + " Milissegundos.");
		/*
		 * Tempo total gasto end-start/1000 para converter de milissegundos para
		 * segundos
		 */
		System.out.println("Tempo Gasto Total Arredondado: " + ((super.getTempoFinal() - super.getTempoInicial()) / 1000d) + " Segundos.");
	}
}
