package br.com.globalcode.aj4.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @course AJ4
 * @chapter 01
 * @page 013
 * @sample 01.04
 */
public class ExemploJFrameComLabel extends JFrame {
	public ExemploJFrameComLabel() {
		super("Janela Swing");
		setSize(275,100);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton label = new JButton("Texto do JLabel");
		add(label);

		setVisible(true);
	}

	public static void main(String[] args) {
		ExemploJFrameComLabel t = new ExemploJFrameComLabel();
	}
}
