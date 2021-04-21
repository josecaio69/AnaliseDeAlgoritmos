package OuvinteBotoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Comparison.QuickSort;
import Insertion.InsertionSort;
import Intercalation.MergeSort;
import Replacement.BubbleSort;
import Selection.SelectionSort;
import Util.VariaveisEmComumParaUso;
import View.WindowsResult;
import View.WindowsStart;

public class OuvinteBotaoOrdenar extends VariaveisEmComumParaUso implements ActionListener {
	private WindowsStart janela;
	private String metodoDesejado;
	private int tamanhoDoVetor;
	private int tipoVetor;
	private int[] vetor;
	private QuickSort quickSort;
	private MergeSort merge;
	private InsertionSort insertion;
	private BubbleSort bolha;
	private SelectionSort selection;

	public OuvinteBotaoOrdenar(WindowsStart janela) {
		this.janela = janela;
		quickSort = new QuickSort();
		merge = new MergeSort();
		insertion = new InsertionSort();
		bolha = new BubbleSort();
		selection = new SelectionSort();
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		try {
			this.metodoDesejado = (String) janela.getComboBoxMetodo().getSelectedItem();
			this.tamanhoDoVetor = Integer.parseInt(janela.getTxTamanhoVetor().getText());
			this.tipoVetor = (janela.getComboBoxTipoVetor().getSelectedIndex());
			vetor = super.getManipulacaoDeVetor()
					.criarVetorDeAcordoComOTipo(janela.getComboBoxMetodo().getSelectedIndex(), this.tamanhoDoVetor);
			this.vetor = super.getManipulacaoDeVetor().criarVetorDeAcordoComOTipo(this.tipoVetor, this.tamanhoDoVetor);

			if (this.metodoDesejado.equals("QuickSort")) {
				super.setTempoInicial(System.currentTimeMillis());
				this.quickSort.quickSort(this.vetor, 0, this.vetor.length - 1);
				super.setTempoFinal(System.currentTimeMillis());
				new WindowsResult((String) this.janela.getComboBoxTipoVetor().getSelectedItem(),
						super.getTempoInicial(), super.getTempoFinal(), quickSort.getQuantidadeDeTrocas(),
						quickSort.getQuantidadeDeComparacoes(), "QuickSort");
				this.janela.dispose();
			} else if (this.metodoDesejado.equals("MergeSort")) {
				super.setTempoInicial(System.currentTimeMillis());
				this.merge.mergeSort(vetor);
				super.setTempoFinal(System.currentTimeMillis());

				new WindowsResult((String) this.janela.getComboBoxTipoVetor().getSelectedItem(),
						super.getTempoInicial(), super.getTempoFinal(), merge.getQuantidadeDeTrocas(),
						merge.getQuantidadeDeComparacoes(), "MergeSort");
				this.janela.dispose();
			} else if (this.metodoDesejado.equals("InsertionSort")) {
				super.setTempoInicial(System.currentTimeMillis());
				this.insertion.insertion(vetor);
				super.setTempoFinal(System.currentTimeMillis());
				new WindowsResult((String) this.janela.getComboBoxTipoVetor().getSelectedItem(),
						super.getTempoInicial(), super.getTempoFinal(), insertion.getQuantidadeDeTrocas(),
						insertion.getQuantidadeDeComparacoes(), "InsertionSort");
				this.janela.dispose();
			} else if (this.metodoDesejado.equals("BubbleSort")) {
				super.setTempoInicial(System.currentTimeMillis());
				this.bolha.bolha(this.vetor);
				super.setTempoFinal(System.currentTimeMillis());
				new WindowsResult((String) this.janela.getComboBoxTipoVetor().getSelectedItem(),
						super.getTempoInicial(), super.getTempoFinal(), bolha.getQuantidadeDeTrocas(),
						bolha.getQuantidadeDeComparacoes(), "BubbleSort");
				this.janela.dispose();
			} else if (this.metodoDesejado.equals("SelectionSort")) {
				super.setTempoInicial(System.currentTimeMillis());
				this.selection.selection(vetor);
				super.setTempoFinal(System.currentTimeMillis());
				new WindowsResult((String) this.janela.getComboBoxTipoVetor().getSelectedItem(),
						super.getTempoInicial(), super.getTempoFinal(), selection.getQuantidadeDeTrocas(),
						selection.getQuantidadeDeComparacoes(), "SelectionSort");
				this.janela.dispose();
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Ocorreu Um Erro, verifique os campos ");
		} catch (NullPointerException isNull) {
			JOptionPane.showMessageDialog(null, "Você não pode criar um vetor sem informar o tamanho");
		}

	}

}
