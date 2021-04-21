package Util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Restringe a digita��o de apenas numeros em um componentes de texto como o
 * JTextField Uso: setDocument(new OnlyNumberField());
 * 
 * @author Eduardo Costa - www.dimensaotech.com
 *
 */
public class ApenasNumeros extends PlainDocument {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maxlength;

	public ApenasNumeros() {
	}

	public ApenasNumeros(int maxlength) {
		super();
		this.maxlength = maxlength;
	}

	public void insertString(int offs, String str, AttributeSet a) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException ex) {
			str = "";
		}
		try {
			boolean fixedLengh = (!((getLength() + str.length()) > maxlength));
			if (maxlength == 0 || fixedLengh)
				super.insertString(offs, str, a);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

}