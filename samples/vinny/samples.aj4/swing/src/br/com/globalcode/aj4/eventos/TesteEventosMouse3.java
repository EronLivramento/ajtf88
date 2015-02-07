package br.com.globalcode.aj4.eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @course AJ4
 * @chapter 01
 * @page 039
 * @sample 01.16
 */
public class TesteEventosMouse3 extends JFrame {

	private JLabel lTexto = new JLabel("Texto inicial");

	public TesteEventosMouse3(String tituloJanela) {
		super(tituloJanela);
		JPanel p1 = new JPanel();

		JButton b1 = new JButton("Botao 1");

		EventosMouseListener2 listener = new EventosMouseListener2();
		b1.addMouseListener(listener);

		p1.add(b1);
		p1.add(lTexto);
		add(p1);
		setSize(200, 200);
		setVisible(true);

	}

	public class EventosMouseListener2 extends MouseAdapter {
		public void mouseClicked(MouseEvent e){
			lTexto.setText("mouseClicked");
			System.out.println("mouseClicked");
		}
	}

	public static void main(String[] args) {
		TesteEventosMouse3 t = new TesteEventosMouse3("TesteMouseListener");
	}

}
