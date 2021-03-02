package Programa;

import Comparison.QuickSort;
import Insertion.InsertionSort;
import Intercalation.MergeSort;
import Replacement.BubbleSort;
import Selection.SelectionSort;
import Util.ManipularVetores;

public class MainTest {

	public static void main(String[] args) {

		int[] vetor = { 2,25, 22, 12, 15, 3, 7, 1,5 };
		BubbleSort b = new BubbleSort();
		SelectionSort selecao = new SelectionSort();
		QuickSort quick = new QuickSort();
		InsertionSort insert = new InsertionSort();
		ManipularVetores imprimir = new ManipularVetores();
		MergeSort merge = new MergeSort();
//		b.bolha(vetor);
//		System.out.println("Ordenação pelo BubbleSort");
//		for (int i = 0; i < vetor.length; i++) 
//			System.out.println(vetor[i]);
			
		
//		selecao.selection(vetor);
//		System.out.println("Ordenação pelo Selection Sort");
//		for (int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
		
//		quick.quickSort(vetor, 0,vetor.length-1);
//		System.out.println("Ordenação pelo QuickSort");
//		for (int i = 0; i < vetor.length; i++) {
//			System.out.println(vetor[i]);
//		}
//		System.out.print("Ordenado");
//		insert.insertion(vetor);
//		imprimir.printDoVetor(vetor);
//		
//		System.out.println("Invertido");
//		imprimir.inverterVetor(vetor);
//		imprimir.printDoVetor(vetor);
		
		merge.mergeSortUsandoRecursividade(0, vetor.length, vetor);
		imprimir.printDoVetor(vetor);
	
	}

}
