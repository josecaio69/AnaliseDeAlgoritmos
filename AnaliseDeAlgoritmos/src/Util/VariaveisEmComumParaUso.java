package Util;

public class VariaveisEmComumParaUso {
	private int[] vetor;
	private ManipularVetores manipulacaoDeVetor;
	private long tempoInicial;
	private long tempoFinal;

	public VariaveisEmComumParaUso() {
		this.manipulacaoDeVetor = new ManipularVetores();
	}

	public int[] getVetor() {
		return vetor;
	}

	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}

	public ManipularVetores getManipulacaoDeVetor() {
		return manipulacaoDeVetor;
	}

	public void setManipulacaoDeVetor(ManipularVetores manipulacaoDeVetor) {
		this.manipulacaoDeVetor = manipulacaoDeVetor;
	}

	public long getTempoInicial() {
		return tempoInicial;
	}

	public void setTempoInicial(long tempoInicial) {
		this.tempoInicial = tempoInicial;
	}

	public long getTempoFinal() {
		return tempoFinal;
	}

	public void setTempoFinal(long tempoFinal) {
		this.tempoFinal = tempoFinal;
	}

}
