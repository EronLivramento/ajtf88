package br.com.globalcode.aj4.eventos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @course AJ4
 * @chapter 01
 * @page 032
 * @sample 01.13
 */
public class TesteEventosMouse extends JFrame {

	public TesteEventosMouse(String tituloJanela) {
		super(tituloJanela);
		JPanel p1 = new JPanel();

		JButton b1 = new JButton("Botao 1");
		EventosMouseListener listener = new EventosMouseListener();
		b1.addMouseListener(listener);

		p1.add(b1);
		add(p1);
		setSize(200,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		TesteEventosMouse t = new TesteEventosMouse("TesteMouseListener");
	}
}
