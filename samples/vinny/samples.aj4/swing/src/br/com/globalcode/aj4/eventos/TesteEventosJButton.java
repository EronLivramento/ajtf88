package br.com.globalcode.aj4.eventos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @course AJ4
 * @chapter 01
 * @page 046
 * @sample 01.19
 */
public class TesteEventosJButton extends JFrame {
	private JButton botao1;
	private JButton botao2;
	private JLabel lTexto;

	public TesteEventosJButton() {
		super("Teste Eventos JButton");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));

		botao1 = new JButton("botao1");
		botao1.setMnemonic(KeyEvent.VK_1);
		botao1.addActionListener(new EventosMouseListener());

		botao2 = new JButton("botao2");
		botao2.setMnemonic(KeyEvent.VK_2);
		botao2.addActionListener(new EventosMouseListener());

		lTexto = new JLabel("acao");

		add(botao1);
		add(lTexto);
		add(botao2);

		setSize(275,100);
		setVisible(true);

	}

	class EventosMouseListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Botao ativado: "+ e.getActionCommand());
			lTexto.setText("Botao ativado: "+e.getActionCommand());
		}

	}

	public static void main(String[] args) {
		TesteEventosJButton t = new TesteEventosJButton();
	}
}
