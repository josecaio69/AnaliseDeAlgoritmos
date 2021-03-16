package Programa;

import Comparison.QuickSort;
import Insertion.InsertionSort;
import Intercalation.MergeSort;
import Replacement.BubbleSort;
import Selection.SelectionSort;

public class MainTest {

	public static void main(String[] args) {

		BubbleSort bubble = new BubbleSort();
		SelectionSort selection = new SelectionSort();
		QuickSort quick = new QuickSort();
		InsertionSort insert = new InsertionSort();
		MergeSort merge = new MergeSort();
		
		//selection.usandoSelectionParaExemplos(100000);
		
		//bubble.usandoBolhaParaExemplos(100000);
		
		//merge.usandoMergeParaExemplos(100000);
		
		//insert.usandoInsertionParaExemplos(100000);
		
		//selection.usandoSelectionParaExemplos(100000);

	}

}
