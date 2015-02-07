package br.com.globalcode.aj4.swing;

import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @course AJ4
 * @chapter 01
 * @page 016
 * @sample 01.06
 */
public class TesteJButtonComIcone extends JFrame {

	public TesteJButtonComIcone() throws MalformedURLException {
		super("Teste JButton");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		URL resource = getClass().getResource("duke.gif");
		ImageIcon iconeBotao = new ImageIcon(resource);
		JButton botaoIcone = new JButton(iconeBotao);
		botaoIcone.setBackground(Color.WHITE);
		add(botaoIcone);

		setSize(80, 150);
		setVisible(true);
	}

	public static void main(String[] args) throws MalformedURLException {
		TesteJButtonComIcone t = new TesteJButtonComIcone();
	}
}
