package Selection;

public class SelectionSort {

	public void selection(int[] vetor) {

		for (int i = 0; i < vetor.length - 1; i++) {
			int indiceDoMenor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[indiceDoMenor]) {
					indiceDoMenor = j;
				}
			}
			int troca = vetor[indiceDoMenor];
			vetor[indiceDoMenor] = vetor[i];
			vetor[i] = troca;
		}

	}
}
