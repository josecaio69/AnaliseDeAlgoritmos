package View;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class WindowsResult extends StandardWindow {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbTipoVetor;
	private JLabel lbTempInicial;
	private JLabel lbTempFinal;
	private JLabel lbTempTotal;
	private JLabel lbQuantTrocas;
	private JLabel lbQuantComp;
	private JLabel lbTitle;

	public WindowsResult(String lbTipoVetor, long lbTempInicial, long lbTempFinal,
			long lbQuantTrocas, long lbQuantComp, String lbTitle) {
		
		this.lbTipoVetor= new JLabel(lbTipoVetor);
		this.lbTempInicial= new JLabel(Long.toString(lbTempInicial)+" Milissegundos");
		this.lbTempFinal =new JLabel(Long.toString(lbTempFinal)+" Milissegundos");
		this.lbTempTotal = new JLabel(Double.toString(((lbTempFinal - lbTempInicial)/1000d))+" Segundos");
		this.lbQuantTrocas =new JLabel(Long.toString(lbQuantTrocas));
		this.lbQuantComp = new JLabel(Long.toString(lbQuantComp));
		this.lbTitle = new JLabel(lbTitle);
		
		this.preencherWindows();
	}

	private void preencherWindows() {
		
		JLabel lbTipo = new JLabel("Tipo do Vetor:");
		lbTipo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbTipo.setBounds(40, 134, 123, 29);
		getContentPane().add(lbTipo);

		lbTipoVetor = new JLabel(this.lbTipoVetor.getText());
		lbTipoVetor.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbTipoVetor.setBounds(219, 134, 192, 29);
		getContentPane().add(lbTipoVetor);

		JLabel lblTempoInicial = new JLabel("Tempo Inicial:");
		lblTempoInicial.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblTempoInicial.setBounds(40, 208, 123, 29);
		getContentPane().add(lblTempoInicial);

		JLabel lblTempoFinal = new JLabel("Tempo Final:");
		lblTempoFinal.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblTempoFinal.setBounds(40, 278, 123, 29);
		getContentPane().add(lblTempoFinal);

		JLabel lblTempoTotalDe = new JLabel("Tempo Total de Exe:");
		lblTempoTotalDe.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblTempoTotalDe.setBounds(40, 346, 161, 29);
		getContentPane().add(lblTempoTotalDe);

		JLabel lblTamanhoVetor = new JLabel("Numero de Trocas:");
		lblTamanhoVetor.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblTamanhoVetor.setBounds(40, 411, 161, 29);
		getContentPane().add(lblTamanhoVetor);

		JLabel lblNumeroDeComp = new JLabel("Numero de Comp.:");
		lblNumeroDeComp.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNumeroDeComp.setBounds(40, 469, 161, 29);
		getContentPane().add(lblNumeroDeComp);

		lbTempInicial.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbTempInicial.setBounds(219, 208, 280, 29);
		getContentPane().add(lbTempInicial);

		lbTempFinal.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbTempFinal.setBounds(219, 278, 280, 29);
		getContentPane().add(lbTempFinal);

		lbTempTotal.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbTempTotal.setBounds(219, 346, 280, 29);
		getContentPane().add(lbTempTotal);

		lbQuantTrocas.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbQuantTrocas.setBounds(219, 411, 192, 29);
		getContentPane().add(lbQuantTrocas);

		lbQuantComp.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lbQuantComp.setBounds(219, 469, 192, 29);
		getContentPane().add(lbQuantComp);

		lbTitle.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lbTitle.setBounds(68, 36, 328, 36);
		getContentPane().add(lbTitle);

		JButton btnNewButton = new JButton("ok");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton.setBounds(168, 559, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new WindowsStart();
			}
		});
		getContentPane().add(btnNewButton);
		
		this.repaint();
	}

	public JLabel getLbTipoVetor() {
		return lbTipoVetor;
	}

	public void setLbTipoVetor(JLabel lbTipoVetor) {
		this.lbTipoVetor = lbTipoVetor;
	}

	public JLabel getLbTempInicial() {
		return lbTempInicial;
	}

	public void setLbTempInicial(JLabel lbTempInicial) {
		this.lbTempInicial = lbTempInicial;
	}

	public JLabel getLbTempFinal() {
		return lbTempFinal;
	}

	public void setLbTempFinal(JLabel lbTempFinal) {
		this.lbTempFinal = lbTempFinal;
	}

	public JLabel getLbTempTotal() {
		return lbTempTotal;
	}

	public void setLbTempTotal(JLabel lbTempTotal) {
		this.lbTempTotal = lbTempTotal;
	}

	public JLabel getLbQuantTrocas() {
		return lbQuantTrocas;
	}

	public void setLbQuantTrocas(JLabel lbQuantTrocas) {
		this.lbQuantTrocas = lbQuantTrocas;
	}

	public JLabel getLbQuantComp() {
		return lbQuantComp;
	}

	public void setLbQuantComp(JLabel lbQuantComp) {
		this.lbQuantComp = lbQuantComp;
	}

	public JLabel getLbTitle() {
		return lbTitle;
	}

	public void setLbTitle(JLabel lbTitle) {
		this.lbTitle = lbTitle;
	}
}
