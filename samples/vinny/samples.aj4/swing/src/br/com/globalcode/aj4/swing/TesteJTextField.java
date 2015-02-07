package br.com.globalcode.aj4.swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @course AJ4
 * @chapter 01
 * @page 017
 * @sample 01.07
 */
public class TesteJTextField extends JFrame {

	public TesteJTextField() {
		super("Teste JTextField");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JTextField textField = new JTextField();
		add(textField);

		setSize(200,50);
		setVisible(true);
	}

	public static void main(String[] args) {
		TesteJTextField t = new TesteJTextField();
	}
}
