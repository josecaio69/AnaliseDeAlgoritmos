package View;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StandardWindow extends JFrame{
	
	
	public StandardWindow() {
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		setTitle("Analise de Algoritmo");
		setSize(500, 700);
		setResizable(false);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		StandardWindow.this.getContentPane().setBackground(Color.lightGray);
		
		
	}
	
}
