package br.com.globalcode.aj4.swing;

import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @course AJ4
 * @chapter 01
 * @page 016
 * @sample 01.05
 */
public class TesteJButton extends JFrame {

	public TesteJButton() {
		super("Teste JButton");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton botaoOK = new JButton("Ok");
		botaoOK.setMnemonic(KeyEvent.VK_O);
		this.add(botaoOK);

		setSize(200,50);
		setVisible(true);
	}

	public static void main(String[] args) {
		TesteJButton t = new TesteJButton();
	}
}
