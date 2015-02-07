package br.com.globalcode.aj4.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @course AJ4
 * @chapter 01
 * @page 031
 * @sample 01.12
 */
public class EventosMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}

}
