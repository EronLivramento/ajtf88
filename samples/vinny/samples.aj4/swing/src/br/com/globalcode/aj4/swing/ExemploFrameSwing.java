package br.com.globalcode.aj4.swing;

import javax.swing.JFrame;

/**
 * @course AJ4
 * @chapter 01
 * @page 012
 * @sample 01.03
 */
public class ExemploFrameSwing extends JFrame {

	public ExemploFrameSwing() {
		super("Janela Swing");
		setSize(275,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		ExemploFrameSwing t = new ExemploFrameSwing();
	}
}
