package Intercalation;

public class MergeSort {
	
	 private void intercalar(int[] vetor, int inicio, int meio, int fim) {
		    /* Vetor utilizado para guardar os valors ordenados. */
		    int novoVetor[] = new int[fim - inicio];
		    /* Variavel utilizada para guardar a posicao do inicio do vetor. */
		    int i = inicio;
		    /* Variavel utilizada para guardar a posi��o do meio do vetor. */
		    int m = meio;
		    /* Variavel utilizada para guarda a posi��o onde os
		      valores ser�o inseridos no novo vetor. */
		    int pos = 0;
		    
		    /* Enquanto o inicio n�o chegar at� o meio do vetor, ou o meio do vetor
		      n�o chegar at� seu fim, compara os valores entre o inicio e o meio,
		      verificando em qual ordem vai guarda-los ordenado.*/
		    while(i < meio && m < fim) {
		      /* Se o vetor[i] for menor que o vetor[m], ent�o guarda o valor do
		        vetor[i] pois este � menor. */
		      if(vetor[i] <= vetor[m]) {
		        novoVetor[pos] = vetor[i];
		        pos = pos + 1;
		        i = i + 1;
		      // Sen�o guarda o valor do vetor[m] pois este � o menor.
		      } else {
		        novoVetor[pos] = vetor[m];
		        pos = pos + 1;
		        m = m + 1;
		      }
		    }
		    
		    // Adicionar no vetor os elementos que est�o entre o inicio e meio,
		    // que ainda n�o foram adicionados no vetor.
		    while(i < meio) {
		      novoVetor[pos] = vetor[i];
		      pos = pos + 1;
		      i = i + 1;
		    }
		    
		    // Adicionar no vetor os elementos que est�o entre o meio e o fim,
		    // que ainda n�o foram adicionados no vetor.
		    while(m < fim) {
		      novoVetor[pos] = vetor[m];
		      pos = pos + 1;
		      m = m + 1;
		    }
		    
		    // Coloca no vetor os valores j� ordenados.
		    for(pos = 0, i = inicio; i < fim; i++, pos++) {
		      vetor[i] = novoVetor[pos];
		    }
		  }
	 
	 public void mergeSortUsandoRecursividade(int inicio, int fim, int[] vetor) {
		   // System.out.println("Inicio: " + inicio + " - Fim: " + fim);
		    /* Se o inicio for menor que o fim menos 1, significa que tem elementos
				  dentro do vetor. */
		    if(inicio < fim - 1) {
		      // Guarda a posi��o do meio do vetor.
		      int meio = (inicio + fim) / 2;
		      
		      /* Chama este m�todo recursivamente, indicando novas posi��es do
					  inicio e fim do vetor. */
		      mergeSortUsandoRecursividade(inicio, meio, vetor);
		      
		      /* Chama este m�todo recursivamente, indicando novas posi��es do
					  inicio e fim do vetor. */
		      mergeSortUsandoRecursividade(meio, fim, vetor);
		      
		      // Chama o m�todo que intercala os elementos do vetor.
		      intercalar(vetor, inicio, meio, fim);
		    }
		  }
		}
