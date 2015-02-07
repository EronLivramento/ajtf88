package br.com.globalcode.aj4.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @course AJ4
 * @chapter 01
 * @page 025
 * @sample 01.11
 */
public class TesteBorderLayout extends JFrame {

	public TesteBorderLayout() {
		super("teste Border Layout Globalcode");
		this.setSize(400, 200);
		JPanel pBotoes = montaJPanelBotoes();
		JPanel pLogin = montaJPanelLogin();

		setLayout(new BorderLayout());

		add(new JLabel("Border Layout na posicao NORTH"), BorderLayout.WEST);
		add(pBotoes, BorderLayout.EAST);
		add(pLogin, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public JPanel montaJPanelBotoes() {
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton bSalvar = new JButton("Salvar");
		p.add(bSalvar);
		JButton bExcluir = new JButton("Excluir");
		p.add(bExcluir);
		return p;
	}

	public JPanel montaJPanelLogin() {
		JPanel p = new JPanel();
		JTextField tfNumeroConta = new JTextField("", 10);
		JTextField tfAgencia = new JTextField("", 10);
		JTextField tfBanco = new JTextField("", 10);
		JTextField tfLimite = new JTextField("", 10);
		JTextField tfCorrentista = new JTextField("", 10);

		p.setLayout(new GridLayout(5, 2));

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
		TesteBorderLayout t = new TesteBorderLayout();
	}

}
