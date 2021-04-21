package Comparison;

import Util.VariaveisEmComumParaUso;

public class QuickSort extends VariaveisEmComumParaUso{

	/*
	 * @author José Caio Algoritmo de ordenação Insertion sorte
	 * 
	 * Neste metodo usando como parametros de entrada o vetor a ser ordenado O
	 * inicio do vetor que seria 0, e o fim que seria a quantidade de elementos do
	 * vetor -1
	 */

	public void quickSort(int vetor[], int inicio, int fim) {
		int ponteiroEsquerdo = inicio;
		int ponteiroDireito = fim;
		int pivo = vetor[(ponteiroEsquerdo + ponteiroDireito) / 2];
		int troca = 0;
		/*
		 * Usamos os ponteiros para fazer comparação com nosso elemento mais central
		 * (PIVO) incrementamos o pivo esquerdo e diminuimos o direito, fazendo as
		 * devidas trocas se houver até o momento em que os ponteirod acabam se
		 * cruzando.
		 */

		while (ponteiroEsquerdo <= ponteiroDireito) {
			while (vetor[ponteiroEsquerdo] < pivo) {
				ponteiroEsquerdo++;
				super.setQuantidadeDeComparacoes(super.getQuantidadeDeComparacoes()+1);
				
			}

			while (vetor[ponteiroDireito] > pivo) {
				ponteiroDireito--;
				super.setQuantidadeDeComparacoes(super.getQuantidadeDeComparacoes()+1);
				
			}
				
			
			if (ponteiroEsquerdo <= ponteiroDireito) {
				troca = vetor[ponteiroEsquerdo];
				vetor[ponteiroEsquerdo] = vetor[ponteiroDireito];
				vetor[ponteiroDireito] = troca;
				ponteiroEsquerdo++;
				ponteiroDireito--;
				super.setQuantidadeDeTrocas(super.getQuantidadeDeTrocas()+1);
			}
		}
		

		/*
		 * Após os ponteiros se cruzarem, saimos de dentro do laço e testanmos os
		 * valores obtidos para fazer as devidas chamadas recursivas para que o processo
		 * se repita até o ponto de ordenar o vetor.
		 */
		/*
		 * No primeiro teste verificamos se o apontador direito ultrapassou o inicio, se
		 * sim chamamos o metodo passando o vetor, a posição para que percorra até o
		 * valor do ponteiro direito
		 */
		if (ponteiroDireito > inicio)
			quickSort(vetor, inicio, ponteiroDireito);
		/*
		 * No segundo teste, verificamos se o ponteiro esquerdo ainda não ultrapassou o
		 * fim do vetor se for verdade, chamamos o metodo passando o vetor, o ponteiro
		 * esquerdo e fim para que o mesmo percorra de onde parou do lado esquerdo até o
		 * fim do vetor
		 */
		if (ponteiroEsquerdo < fim)
			quickSort(vetor, ponteiroEsquerdo, fim);
		

	}
	
	public void usandoQuickSortParaExemplos(int [] vetorParaSerOrdenado) {
		super.setQuantidadeDeTrocas(0);
		super.setQuantidadeDeComparacoes(0);
		/* Criando vetor do tamanho desejado */
		super.setVetor(vetorParaSerOrdenado);
		System.out.println("Quick sort com vetor contendo " + (vetorParaSerOrdenado.length)+" elementos.");
		/* Cauculando tempo de inicio */
		super.setTempoInicial(System.currentTimeMillis());
		System.out.println("Tempo Inicial: " + super.getTempoInicial() + " Milissegundos.");
		this.quickSort(super.getVetor(),0,super.getVetor().length-1);
		/* Calculando tempo final */
		super.setTempoFinal(System.currentTimeMillis());
		System.out.println("Tempo Final:   " + super.getTempoFinal() + " Milissegundos.");
		/*
		 * Tempo total gasto end-start/1000 para converter de milissegundos para
		 * segundos
		 */
		System.out.println("Tempo Gasto Total Arredondado: " + ((super.getTempoFinal() - super.getTempoInicial()) / 1000d) + " Segundos.");
		System.out.println("Quantidade de comparações: "+super.getQuantidadeDeComparacoes());
		System.out.println("Quantidade de trocas: "+super.getQuantidadeDeTrocas());

	}

}
