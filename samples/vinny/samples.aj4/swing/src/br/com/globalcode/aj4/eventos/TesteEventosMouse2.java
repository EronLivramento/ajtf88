package br.com.globalcode.aj4.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @course AJ4
 * @chapter 01
 * @page 035
 * @sample 01.14
 */
public class TesteEventosMouse2 extends JFrame implements MouseListener {

	private JLabel lTexto = new JLabel("Texto inicial");
	private JButton b1 = new JButton("Botao 1");

	public TesteEventosMouse2(String tituloJanela) {
		super(tituloJanela);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel p1 = new JPanel();

		b1.addMouseListener(this);

		p1.add(b1);
		p1.add(lTexto);
		add(p1);
		setSize(200, 200);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		lTexto.setText("mouseClicked"); System.out.println("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lTexto.setText("mousePressed"); System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		lTexto.setText("mouseReleased"); System.out.println("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		lTexto.setText("mouseEntered"); System.out.println("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		lTexto.setText("mouseExited"); System.out.println("mouseExited");
	}

	public static void main(String[] args) {
		TesteEventosMouse2 frame = new TesteEventosMouse2("TesteEventosMouse");
	}

}
