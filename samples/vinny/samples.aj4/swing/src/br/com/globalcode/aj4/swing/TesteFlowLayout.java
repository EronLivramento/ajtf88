package br.com.globalcode.aj4.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @course AJ4
 * @chapter 01
 * @page 022
 * @sample 01.09
 */
public class TesteFlowLayout extends JFrame {

	public TesteFlowLayout() {
		super("Teste FlowLayout Globalcode!");

		JPanel pBotoes = montaPanelBotoes();
		add(pBotoes);
		setSize(275,100);
		setVisible(true);
	}

	public JPanel montaPanelBotoes() {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		p.add(new JButton("Salvar"));
		p.add(new JButton("Excluir"));
		return p;
	}

	public static void main(String[] args) {
		TesteFlowLayout t = new TesteFlowLayout();
	}
}
