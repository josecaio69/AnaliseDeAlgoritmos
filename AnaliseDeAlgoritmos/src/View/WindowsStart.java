package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import OuvinteBotoes.OuvinteBotaoOrdenar;
import Util.ApenasNumeros;

public class WindowsStart extends StandardWindow {
	private JTextField txTamanhoVetor;
	private JComboBox comboBoxMetodo;
	private JButton btOrdenar;
	private JComboBox comboBoxTipoVetor;

	public WindowsStart() {
		this.preencherJanela();
	}

	private void preencherJanela() {
		JLabel lbTitle = new JLabel("Analise de Algoritmos de Ordernation");
		lbTitle.setFont(new Font("Arial Black", Font.BOLD, 18));
		lbTitle.setBounds(50, 22, 384, 37);
		getContentPane().add(lbTitle);

		comboBoxMetodo = new JComboBox<Object>(new Object[] { "Sel. o metodo desejado", "QuickSort", "MergeSort",
				"InsertionSort", "BubbleSort", "SelectionSort" });
		comboBoxMetodo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		comboBoxMetodo.setBounds(244, 127, 213, 22);
		getContentPane().add(comboBoxMetodo);

		JLabel lbAlgoritmoDesejado = new JLabel("Met\u00F3do de Ordena\u00E7\u00E3o:");
		lbAlgoritmoDesejado.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbAlgoritmoDesejado.setBounds(33, 128, 201, 20);
		getContentPane().add(lbAlgoritmoDesejado);

		JLabel lbTamanho = new JLabel("Tamanho do Vetor:");
		lbTamanho.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbTamanho.setBounds(33, 313, 201, 20);
		getContentPane().add(lbTamanho);

		txTamanhoVetor = new JTextField();
		txTamanhoVetor.setBounds(244, 314, 213, 22);
		txTamanhoVetor.setDocument(new ApenasNumeros());
		getContentPane().add(txTamanhoVetor);
		txTamanhoVetor.setColumns(10);

		btOrdenar = new JButton("Ordenar");
		btOrdenar.setFont(new Font("Arial Black", Font.BOLD, 14));
		btOrdenar.setBounds(50, 458, 124, 37);
		getContentPane().add(btOrdenar);
		btOrdenar.addActionListener(new OuvinteBotaoOrdenar(this));

		JButton btSair = new JButton("Sair");
		btSair.setFont(new Font("Arial Black", Font.BOLD, 14));
		btSair.setBounds(309, 458, 124, 37);
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Até Logo"+"\n"+" By: Jose Caio");
				dispose();
			}
		});
		getContentPane().add(btSair);

		comboBoxTipoVetor = new JComboBox<Object>(new Object[] { "Sel. modo do vetor", "Aleatorio", "Ordenado",
				"Quase Ordenado", "Inverso"});
		comboBoxTipoVetor.setFont(new Font("Arial Black", Font.PLAIN, 14));
		comboBoxTipoVetor.setBounds(244, 208, 213, 22);
		getContentPane().add(comboBoxTipoVetor);

		JLabel lbMetodoDesejado = new JLabel("Modo do Vetor:");
		lbMetodoDesejado.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbMetodoDesejado.setBounds(33, 208, 201, 20);
		getContentPane().add(lbMetodoDesejado);
		this.repaint();
	}

	public JTextField getTxTamanhoVetor() {
		return txTamanhoVetor;
	}

	public void setTxTamanhoVetor(JTextField txTamanhoVetor) {
		this.txTamanhoVetor = txTamanhoVetor;
	}

	public JButton getBtOrdenar() {
		return btOrdenar;
	}

	public void setBtOrdenar(JButton btOrdenar) {
		this.btOrdenar = btOrdenar;
	}

	public JComboBox getComboBoxMetodo() {
		return comboBoxMetodo;
	}

	public void setComboBoxMetodo(JComboBox comboBoxMetodo) {
		this.comboBoxMetodo = comboBoxMetodo;
	}

	public JComboBox getComboBoxTipoVetor() {
		return comboBoxTipoVetor;
	}

	public void setComboBoxTipoVetor(JComboBox comboBoxTipoVetor) {
		this.comboBoxTipoVetor = comboBoxTipoVetor;
	}
	

}
