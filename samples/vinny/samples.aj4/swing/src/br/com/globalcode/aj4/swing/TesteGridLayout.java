package br.com.globalcode.aj4.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @course AJ4
 * @chapter 01
 * @page 023
 * @sample 01.10
 */
public class TesteGridLayout extends JFrame {

	public TesteGridLayout() {
		super("teste Grid Layout Globalcode");
		JPanel pLogin = montaJPanelLogin();
		add(pLogin, BorderLayout.NORTH);
		this.setSize(400,150);
		this.setVisible(true);
	}

	public JPanel montaJPanelLogin(){
		JPanel p = new JPanel();
		JTextField tfNumeroConta = new JTextField("", 10);
		JTextField tfAgencia = new JTextField("", 10);
		JTextField tfBanco = new JTextField("", 10);
		JTextField tfLimite = new JTextField("", 10);
		JTextField tfCorrentista = new JTextField("", 10);

		p.setLayout(new GridLayout(5,2));

		p.add(new JLabel("Numero da conta"));
		p.add(tfNumeroConta);
		p.add(new JLabel("Agencia"));
		p.add(tfAgencia);
		p.add(new JLabel("Banco"));
		p.add(tfBanco);
		p.add(new JLabel("Limite"));
		p.add(tfLimite);
		p.add(new JLabel("Correntista"));
		p.add(tfCorrentista);
		return p;
	}

	public static void main(String[] args) {
		TesteGridLayout t = new TesteGridLayout();
	}
}
