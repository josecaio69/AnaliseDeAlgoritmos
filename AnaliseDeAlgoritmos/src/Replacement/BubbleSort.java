package Replacement;

public class BubbleSort {

	public void bolha(int[] vetor) {
		for (int i = 0; i < vetor.length ; i++) {
			for (int j = 0; j < vetor.length-1; j++) {
				if(vetor[j] > vetor[j+1]) {
					int troca = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = troca;
				}
			}
		}
	}

}
