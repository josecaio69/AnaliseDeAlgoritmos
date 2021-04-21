package Programa;

import Comparison.QuickSort;
import Insertion.InsertionSort;
import Intercalation.MergeSort;
import Replacement.BubbleSort;
import Selection.SelectionSort;
import Util.ManipularVetores;

public class MainViaConsole {

	public static void main(String[] args) {
		
		
		/*
		 * USE A INTERFACE GRAFICA 
		 * É MAIS INTUITIVO PARA O USO
		 */
		
		
		
		int vetorAleatorio [];
		int vetorQuaseOrdenado[];
		int vetorInverso[];
		int vetorOrdenado[];
		BubbleSort bubble = new BubbleSort();
		SelectionSort selection = new SelectionSort();
		QuickSort quick = new QuickSort();
		InsertionSort insert = new InsertionSort();
		MergeSort merge = new MergeSort();
		ManipularVetores criarVetores = new ManipularVetores();
		//Criando vetores, só passar o tamanho desejado
		vetorAleatorio = criarVetores.criarVetorAleatorio(10);
		vetorQuaseOrdenado = criarVetores.criarVetorQuaseOrdenado(10);
		vetorOrdenado = criarVetores.criarVetorOrdenado(10);
		vetorInverso = criarVetores.criarVetorvetorInvertido(10);
		//Usando o quick como exemplo
		quick.quickSort(vetorAleatorio, 0, vetorAleatorio.length-1);
		//Para chamar os demais Metodos, é só usar a instancia e chamar o metodo 
		
		
		System.out.println("Trocas: "+quick.getQuantidadeDeTrocas());
		System.out.println("Comp : "+quick.getQuantidadeDeComparacoes());
		System.out.println("Temp: "+((quick.getTempoFinal()-quick.getTempoInicial())/1000d));
		
		
		
		
//		System.out.println("Criando Vetor Aleatorio com o tamanho desejado ");
//		vetorAleatorio = criarVetores.criarVetorAleatorio(100000);
//		bubble.ordenarComBubbleSort(vetorAleatorio);
//		System.out.println("-----------------------------------------------");
//		
//		System.out.println("Criando Vetor Ordenado com o tamanho desejado ");
//		vetorAleatorio = criarVetores.criarVetorOrdenado(5);
//		bubble.ordenarComBubbleSort(vetorAleatorio);
		
//		System.out.println("Criando Vetor Aleatorio com o tamanho desejado ");
//		vetorAleatorio = criarVetores.criarVetorAleatorio(10);
//		System.out.println("Ordenando vetor com "+vetorAleatorio.length+" elementos, com o QuickSort");
//		/*Chamando o metodo que vai usar o quick e calcular o tempo  de exe.*/
//		quick.usandoQuickSortParaExemplos(vetorAleatorio);
//		
//		
//		System.out.println("-----------------------------------------------");
//		System.out.println("Criando Vetor Ordenado com o tamanho desejado ");
//		vetorOrdenado = criarVetores.criarVetorOrdenado(10);
//		quick.usandoQuickSortParaExemplos(vetorOrdenado);
//		
//		System.out.println("-----------------------------------------------");
//		System.out.println("Criando Vetor Inverso com o tamanho desejado ");
//		vetorInverso = criarVetores.criarVetorvetorInvertido(10);
//		quick.usandoQuickSortParaExemplos(vetorInverso);
//		
//		System.out.println("-----------------------------------------------");
//		System.out.println("Criando Vetor Inverso com o tamanho desejado ");
//		vetorInverso = criarVetores.criarVetorQuaseOrdenado(10);
//		quick.usandoQuickSortParaExemplos(vetorInverso);
//		
		
		
		//selection.usandoSelectionParaExemplos(100000);
		
		//bubble.usandoBolhaParaExemplos(5);
		
		//merge.usandoMergeParaExemplos(1000000);
		
		//insert.usandoInsertionParaExemplos(100000);
		
		//selection.usandoSelectionParaExemplos(100000);
		
		//quick.usandoQuickSortParaExemplos(100000000);
	}

}
