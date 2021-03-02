package Comparison;

public class QuickSort {

	public static void quickSort(int vetor[], int inicio, int fim) {
		int ponteiroEsquerdo = inicio;
		int ponteiroDireito = fim;
		int pivo = vetor[(ponteiroEsquerdo + ponteiroDireito) / 2];
		int troca;

		while (ponteiroEsquerdo <= ponteiroDireito) {
			while (vetor[ponteiroEsquerdo] < pivo) 
				ponteiroEsquerdo ++;
			
			while (vetor[ponteiroDireito] > pivo) 
				ponteiroDireito --;
			
			if (ponteiroEsquerdo <= ponteiroDireito) {
				troca = vetor[ponteiroEsquerdo];
				vetor[ponteiroEsquerdo] = vetor[ponteiroDireito];
				vetor[ponteiroDireito] = troca;
				ponteiroEsquerdo ++;
				ponteiroDireito --;
			}
		}
		if (ponteiroDireito > inicio)
			quickSort(vetor, inicio, ponteiroDireito);

		if (ponteiroEsquerdo < fim)
			quickSort(vetor, ponteiroEsquerdo, fim);

	}


}
