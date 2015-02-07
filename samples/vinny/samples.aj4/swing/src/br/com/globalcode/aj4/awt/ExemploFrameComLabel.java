package br.com.globalcode.aj4.awt;

import java.awt.Frame;
import java.awt.Label;

/**
 * @course AJ4
 * @chapter 01
 * @page 010
 * @sample 01.02
 */
public class ExemploFrameComLabel extends Frame {

	public ExemploFrameComLabel(String title) {
		setTitle(title);
		setSize(200,100);

		Label l = new Label("AWT Label");
		add(l);

		setVisible(true);
	}

	public static void main(String[] args) {
		ExemploFrameComLabel janela = new ExemploFrameComLabel("Titulo da Janela");
	}
}
