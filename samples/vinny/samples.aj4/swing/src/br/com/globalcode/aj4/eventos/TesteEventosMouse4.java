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
 * @page 043
 * @sample 01.17
 */
public class TesteEventosMouse4 extends JFrame {

	private JLabel lTexto = new JLabel("Texto inicial");

	public TesteEventosMouse4(String tituloJanela){
		super(tituloJanela);
		JPanel p1 = new JPanel();

		JButton b1 = new JButton("Botao 1");
		MouseAdapter l = new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				lTexto.setText("mouseClicked INNER");
				System.out.println("mouseClicked INNER");
			}
		};
		b1.addMouseListener(l);

		p1.add(b1);
		p1.add(lTexto);
		add(p1);
		setSize(200, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		TesteEventosMouse4 frame = new TesteEventosMouse4("TesteMouseListener");
	}
}
