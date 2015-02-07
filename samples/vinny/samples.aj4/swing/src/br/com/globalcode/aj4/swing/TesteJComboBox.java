package br.com.globalcode.aj4.swing;

import java.awt.FlowLayout;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * @course AJ4
 * @chapter 01
 * @page 019
 * @sample 01.08
 */
public class TesteJComboBox extends JFrame {

	public TesteJComboBox() {
		super("Teste JComboBox");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		final JComboBox<String> seletorBancos = new JComboBox<String>();
		seletorBancos.addItem("Itau");
		seletorBancos.addItem("Bradesco");
		seletorBancos.addItem("Globalcode Bank");
		seletorBancos.setBounds(10, 10, 100, 100);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(seletorBancos);

		setSize(275,50);
		setVisible(true);
	}

	public static void main(String[] args) {
		TesteJComboBox t = new TesteJComboBox();
	}
}

